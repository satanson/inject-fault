parser grammar FailPointParser;
options { tokenVocab=FailPointLexer; }

file
    :   file_content EOF;

file_content
    :   non_failpoint_line+ (failpoint_block+ non_failpoint_line*)*
    ;

non_failpoint_line
    :   regular_line
    |   external_dependentency
    ;

regular_line
    :   blank_line
    |   non_blank_line
    |   failpoint_end_line
    ;


external_dependentency
    :   import_line
    |   include_line
    ;

blank_line
    :   BlankLine
    ;

non_blank_line
    :   NonBlankLine_Prefix NonBlankLine_Suffix
    ;

import_line
    :   ImportLine_Prefix ImportLine_Ws*
            ImportLine_Static? ImportLine_Ws* import_package
            ImportLine_Ws* ImportLine_Terminator
    ;

import_package
    :   ImportLine_Package
    ;

include_line
    :   IncludeLine_Prefix IncludeLine_Ws*
            IncludeLine_Sep IncludeLine_Ws* include_header
            IncludeLine_Ws* IncludeLine_Sep IncludeLine_Ws* IncludeLine_Terminator
    ;

include_header
    :   IncludeLine_Header
    ;

failpoint_block
    :   failpoint_begin_line commented_code_line*
    ;

failpoint_begin_line
    :   FailPointLine_Prefix Sep failpoint_declare FailPointLine_Terminator
    ;

commented_code_line
    :   leading_space? CommentedCode_Prefix code
    ;

failpoint_end_line
    :   LeadingSpace? NonCommentedCode
    ;

leading_space
    :   LeadingSpace
    ;

code
    :   CommentedCode_Suffix
    ;

failpoint_declare
    :   type var (Equal default_literal)?
    ;

type
    :   BooleanType
    |   StringType
    |   IntegerType
    |   FloatType
    ;

default_literal
    :   BooleanLiteral
    |   StringLiteral
    |   IntegerLiteral
    |   FloatLiteral
    ;

var
    :   Name;
