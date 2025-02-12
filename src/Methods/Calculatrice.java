package Methods;

import com.sun.jdi.Value;

    public class Calculatrice {

        public double effectuerOperation(String operation, int a, int b){
            switch(operation){
                case "add":
                    return add(a,b);
                case "sous":
                    return sous(a,b);
                case "div":
                    return div(a,b);
                case "multi":
                    return multi(a,b);
            }
            return 0;
        }

        public double effectuerOperation(String operation, double a, double b){
            switch(operation){
                case "add":
                    return add(a,b);
                case "sous":
                    return sous(a,b);
                case "div":
                    return div(a,b);
                case "multi":
                    return multi(a,b);
            }
            return 0;
        }

        public int add(int a, int b){
            return a + b;
        }
        public int sous(int a, int b){
            return a - b;
        }
        public int div(int a, int b){
            return a / b;
        }
        public int multi(int a, int b){
            return a * b;
        }
        public double add(double a, double b){
            return a + b;
        }
        public double div(double a, double b){
            return a / b;
        }
        public double multi(double a, double b){
            return a * b;
        }
        public double sous(double a, double b){
            return a - b;
        }
    }
