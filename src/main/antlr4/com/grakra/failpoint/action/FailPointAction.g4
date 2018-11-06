grammar FailPointAction;

import CommonTokens;

failpoint_action
    :   failpoint_action_internal EOF
    ;

failpoint_action_internal
    :   act_simple
    |   act_series
    ;

act_series
    :   act_series_elm (Arrow act_series_elm)* act_series_trail?
    ;

act_series_trail
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

act_series_elm
    :   act_repeatable
    |   act_repeated
    ;

act_random
    :   LeftBracket act_random_elm (Comma act_random_elm)* RightBracket
    ;

act_random_elm
    :   random_prob Star act_qualifiable
    ;

random_prob
    :   floatLiteral
    ;

act_qualifiable
    :   act_nop
    |   act_stall
    |   act_return
    |   act_stall_return
    ;

act_repeated
    :   repeat_times Star act_repeatable
    ;

repeat_times
    :   integerLiteral
    ;

act_repeatable
    :   act_qualifiable
    |   act_random
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
