lexer grammar FailPointLexer;
import CommonTokens;

fragment
CppHeaderChar
    :   [a-zA-Z0-9._/-]
    ;


fragment
Colon
    :   ':'
    ;

fragment
Slash
    :   '/'
    ;
fragment
Non_Slash
    :   ~[/]
    ;

fragment
Double_Slash
    :   '//'
    ;

fragment
SlashWs
    :   [/ \t]
    ;

fragment
Non_SlashWs
    :   ~[/ \t]
    ;

fragment
FailPoint
    :   'failpoint'
    ;

fragment
Non_FailPoint
    :    ~[ \tf]
    |   'f' ~[a]
    |   'fa' ~[i]
    |   'fai' ~[l]
    |   'fail' ~[p]
    |   'failp' ~[o]
    |   'failpo' ~[i]
    |   'failpoi' ~[n]
    |   'failpoin' ~[t]
    ;

fragment
SemicolonAndNl_Terminator
    :   Ws* ';' Ws* Nl
    ;

fragment
Nl_Terminator
    :   Ws* Nl
    ;

// DEFAULT_MODE
ImportLine_Prefix
    :   Ws* 'import' Ws* -> pushMode(import_line_suffix)
    ;

IncludeLine_Prefix
    :   Ws* '#include' Ws* -> pushMode(include_line_suffix)
    ;

BlankLine
    :   Ws* Nl
    ;

NonBlankLine_Prefix
    :   Ws* (
                    Non_SlashWs
                |   Slash Non_Slash
                |   Double_Slash Ws* Non_FailPoint
            )
        ->pushMode(non_blank_line_suffix)
    ;

FailPointLine_Prefix
    :   Ws* Double_Slash Ws* FailPoint ->mode(failpoint_line_suffix)
    ;

mode import_line_suffix;
ImportLine_Ws
    :   Ws
    ;

ImportLine_Static
    :   'static'
    ;

ImportLine_Package
    :   W+ ('.' W+)* '.*' ?
    ;

ImportLine_Terminator
    : SemicolonAndNl_Terminator -> popMode
    ;

mode include_line_suffix;
IncludeLine_Ws
    :   Ws
    ;

IncludeLine_Sep
    :   ["<>]
    ;

IncludeLine_Header
    :   CppHeaderChar+
    ;

IncludeLine_Terminator
    :   Nl ->popMode
    ;

mode non_blank_line_suffix;

NonBlankLine_Suffix
    :   Non_Nl* Nl -> popMode
    ;

mode failpoint_line_suffix;

FailPointLine_Terminator
    :   SemicolonAndNl_Terminator -> mode(failpoint_commented_code_block)
    ;

Sep
    :   Colon
    ;

Equal
    :   '='
    ;

IngoreWs
    :   Ws ->skip
    ;

BooleanType
    :   'bool'
    |   'boolean'
    ;

StringType
    :   'string'
    |   'std::string'
    |   'String'
    ;

IntegerType
    :   'byte' | 'short' | 'int' |'long'
    |   'int8_t'|'int16_t'| 'int32_t' |'int64_t'
    |   'uint8_t'|'uint16_t'| 'uint32_t' |'uint64_t'
    |   'size_t' |'ssize_t'
    ;

FloatType
    :   'float'
    |   'double'
    ;

BooleanLiteral
    :   F_BooleanLiteral
    ;

StringLiteral
    :   F_StringLiteral
    ;

IntegerLiteral
    :   F_IntegerLiteral
    ;

FloatLiteral
    :   F_FloatLiteral
    ;

Name
    :   [a-zA-Z_][a-zA-Z_0-9]*
    ;

mode failpoint_commented_code_block;

LeadingSpace
    :   Ws+
    ;

CommentedCode_Prefix
    :   Double_Slash ->pushMode(commented_code_suffix)
    ;

NonCommentedCode
    :   ((Non_SlashWs | Slash Non_Slash) Non_Nl*)? Nl ->mode(DEFAULT_MODE)
    ;

mode commented_code_suffix;

CommentedCode_Suffix
    :   Non_Nl* Nl ->popMode
    ;
