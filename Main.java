public class Main {

    public static void main(String[] args) {
	// write your code here
        // define all the variables for Towers
        float h1=72;
        float h2=19;
        float h3=50;
        float h4=67;
        float h5=16;
        float h6=53;
        float h7=69;
        float h8=30;
        float h9=52;
        float h10=40;
        float h11=31;
        float h12=75;
        float d1=22f;
        float d2=18f;
        float d3=13f;
        float d4=16f;
        float d5=14f;
        float d6=23f;
        float d7=22f;
        float d8=22f;
        float d9=23f;
        float d10=16f;
        float d11=18f;
        float d12=23f;

        float pi = 3.14f;
        float pop = 37640;
        float days = 28;
        float averagewater = 0.246f;

        // calculate the total water usage by the town
        float waterusage = pop*averagewater*days;
        System.out.printf("The water usage of the town is: %f\n\n", waterusage);

        // calculate the Volume of Tower 1
        float Vlm1 = (d1/2)*(d1/2)*pi*h1;
        System.out.printf("The volume of the first tower is: %f\n\n", Vlm1);

        // calculate the Volume of Tower 2
        float Vlm2 = (d2/2)*(d2/2)*pi*h2;
        System.out.printf("The volume of the second tower is: %f\n\n", Vlm2);

        // calculate the Volume of Tower 3
        float Vlm3 = (d3/2)*(d3/2)*pi*h3;
        System.out.printf("The volume of the third tower is: %f\n\n", Vlm3);

        // calculate the Volume of Tower 4
        float Vlm4 = (d4/2)*(d4/2)*pi*h4;
        System.out.printf("The volume of the fourth tower is: %f\n\n", Vlm4);

        // calculate the Volume of Tower 5
        float Vlm5 = (d5/2)*(d5/2)*pi*h5;
        System.out.printf("The volume of the fifth tower is: %f\n\n", Vlm5);

        // calculate the Volume of Tower 6
        float Vlm6 = (d6/2)*(d6/2)*pi*h6;
        System.out.printf("The volume of the sixth tower is: %f\n\n", Vlm6);

        // calculate the Volume of Tower 7
        float Vlm7 = (d7/2)*(d7/2)*pi*h7;
        System.out.printf("The volume of the seventh tower is: %f\n\n", Vlm7);

        // calculate the Volume of Tower 8
        float Vlm8 = (d8/2)*(d8/2)*pi*h8;
        System.out.printf("The volume of the eighth tower is: %f\n\n", Vlm8);

        // calculate the Volume of Tower 9
        float Vlm9 = (d9/2)*(d9/2)*pi*h9;
        System.out.printf("The volume of the ninth tower is: %f\n\n", Vlm9);

        // calculate the Volume of Tower 10
        float Vlm10 = (d10/2)*(d10/2)*pi*h10;
        System.out.printf("The volume of the tenth tower is: %f\n\n", Vlm10);

        // calculate the Volume of Tower 11
        float Vlm11 = (d11/2)*(d11/2)*pi*h11;
        System.out.printf("The volume of the eleventh tower is: %f\n\n", Vlm11);

        // calculate the Volume of Tower 12
        float Vlm12 = (d12/2)*(d12/2)*pi*h12;
        System.out.printf("The volume of the twelfth tower is: %f\n\n", Vlm12);

        // calculate the total volume of these 12 Towers
        float TotalV= Vlm1+Vlm2+Vlm3+Vlm4+Vlm5+Vlm6+Vlm7+Vlm8+Vlm9+Vlm10+Vlm11+Vlm12;
        System.out.printf("The total volume of these 12 Towers is: %f\n\n", TotalV);

        // calculate the daily water saving per person
        float Saving= (waterusage-TotalV)/28/37640;
        System.out.printf("The daily water saving per person is: %f\n\n", Saving);






    }
}
