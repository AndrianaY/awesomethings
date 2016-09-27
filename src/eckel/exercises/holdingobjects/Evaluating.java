package eckel.exercises.holdingobjects;
import net.mindview.util.Stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
//(4) Stacks are often used to evaluate expressions in programming languages.
//        Using net.mindview.util.Stack, evaluate the following expression, where’+’ means "push
//        the following letter onto the stack," and’-’ means "pop the top of the stack and print it":
//        "+U+n+c—+e+r+t—+a-+i-+n+t+y—+ -+r+u—+l+e+s—"
/**
 * Created by Andriana on 28.09.2016.
 */
public class Evaluating {
    private Stack<Character> stack = new Stack<>();

    public void performEval(String expr) {
        char c;
        for (int i = 0; i < expr.length(); i++) {
            c = expr.charAt(i);
            if (c == '+') {
                stack.push(expr.charAt(++i));
            } else if (c == '-')
                stack.pop();
        }
    }


    public static void main(String[] args) {
        Evaluating ev = new Evaluating();
        ev.performEval("+U+n+c—+e+r+t—+a-+i-+n+t+y—+ -+r+u—+l+e+s—");
        while (!ev.stack.empty()) {
             System.out.print(ev.stack.pop());
        }
    }



}

