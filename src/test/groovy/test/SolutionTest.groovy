package test

import spock.lang.Specification
import spock.lang.Unroll

class SolutionTest extends Specification {

    @Unroll
    def checksClosings() {
        when:
        def result = Solution.isCorrect(input)

        then:
        result == expectedResult

        where:
        input << ['()', '()[]{}', '(]', ')(', '([)]', '{[]}', ')', '([]', '{', '([)])', '(((((((((())))))))))', '', '()]]']
        expectedResult << [true, true, false, false, false, true, false, false, false, false, true, true, false]
    }
}
