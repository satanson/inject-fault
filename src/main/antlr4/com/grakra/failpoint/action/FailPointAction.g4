grammar FailPointAction;

import CommonTokens;

failpoint_action
    :   failpoint_action_internal EOF
    ;

failpoint_action_internal
    :   act_simple

act_sequential
    :   act_composable (Arrow act_composable)* act_sequential_tail
    ;

act_sequential_tail
    :   act_disable
    ;

act_simple
    :   act_gdb
    |   act_gcore
    |   act_enable
    |   act_status
    |   act_clear
    |   act_show
    |   act_disable
    ;

act_composable
    :   act_randomized
    |   act_repeatable
    |   act_repeated
    ;

act_randomized
    :   LeftBracket act_probable (Comma act_probable)* RightBracket
    ;

act_probable
    :   floatLiteral Star act_qualifiable
    ;

act_qualifiable
    :   act_nop
    |   act_stall
    |   act_return
    |   act_stall_return
    ;

act_repeated
    :   integerLiteral Star act_repeatable
    ;

act_repeatable
    :   act_qualifiable
    |   act_randomized
    ;

act_gdb
    :   Gdb
    ;

act_gcore
    :   Gcore
    ;




act_nop
    :   Nop
    ;

act_stall_return
    :   StallReturn LeftParenthesis numerical_literal Comma literal RightParenthesis
    ;

act_stall
    :   Stall LeftParenthesis numerical_literal RightParenthesis
    ;

act_return
    :   Return LeftParenthesis literal RightParenthesis
    ;

act_show
    : Show
    ;

act_disable
    :   Disable
    ;

act_enable
    :   Enable
    ;

act_status
    :   Status
    ;

act_clear
    :   Clear
    ;

literal
    :   booleanLiteral
    |   stringLiteral
    |   integerLiteral
    |   floatLiteral
    ;

numerical_literal
    :   integerLiteral
    |   floatLiteral
    ;

booleanLiteral
    :   BooleanLiteral
    ;

stringLiteral
    :   StringLiteral
    ;

integerLiteral
    :   IntegerLiteral
    ;

floatLiteral
    :   FloatLiteral
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

Ignored_Ws
    :   Ws ->skip
    ;

Arrow
    :   '->'
    ;

Gdb
    :   'gdb'
    ;

Gcore
    :   'gcore'
    ;

Return
    :   'return'
    ;

Stall
    :   'stall'
    ;

StallReturn
    :   'stall_return'
    ;

Disable
    :   'disable'
    ;

Enable
    :   'enable'
    ;

Show
    :   'show'
    ;

Status
    :   'status'
    ;

Clear
    :   'clear'
    ;

Nop
    :   'nop'
    ;

LeftParenthesis
    :   '('
    ;

RightParenthesis
    :   ')'
    ;

LeftBracket
    :   '['
    ;

RightBracket
    :   ']'
    ;

Star
    :   '*'
    ;

Comma
    :   ','
    ;
