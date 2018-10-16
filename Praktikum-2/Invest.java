public class Invest {

    float total = 14000;
    System.out.prinln("Original investment: $" + total);

    //Inceases by 40 percent the first year total = total + (total * .4F);
    total = total + (total * .4F);
    System.out.println("Inceases by 40 percent the first year : $"  total + (total * .4F));

    //Loses $1,500 the second year total = total - 1500F;
     total = total - 1500F;
     System.out.println("Loses $1,500 the second year total =" total - 1500F);

    //inceases by 12 percent the third year total = total + (total * .12F);
    total = total + (total * .12F);

    
    System.out.println("Inceases by 12 percent the third year total =" total + (total * .12F);

}