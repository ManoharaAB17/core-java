class PaintTest{
public static void main(String Args[]){
		Paint.setPaintId(245);
		Paint.setColor("Cyan");
		Paint.setBrandName("AsianPaints");
		
		System.out.println("Paint Id :"+Paint.getPaintId());
		System.out.println("Brand Name  :"+Paint.getBrandName());
		System.out.println("Paint Color : "+Paint.getColor());
	}
	
}