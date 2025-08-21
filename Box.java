class Box{
	float width;
	float height;
	float depth;

	Box(){
		this.width = 1;
		this.height = 1;
		this.depth = 1;
	}
	Box(float width, float height, float depth){
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	void setwidth(float width){
		this.width = width;
	}
	float getwidth(){
		return width;
	}
	void setheight(float height){
		this.height = height;
	}
	float getheight(){
		return height;
	}
	void setdepth(float depth){
		this.depth = depth;
	}
	float getdepth(){
		return depth;
	}

	float Volume(){
		return width*height*depth;
	}
}
class BoxWeight extends Box{
	float weight;
	BoxWeight(){
		super();
		this.weight = 1;
	}	
	BoxWeight(float width, float height, float depth, float weight){
		this.width = width;
		this.height = height;
		this.depth = depth;
		this.weight = weight;
	}
	void setweight(float weight){
		this.weight = weight;
	}
	float getweight(){
		return weight;
	}
	float Weight(){
		return width*height*depth*weight;
	}
}
class BoxWeightDemo{
	public static void main(String[]args){
		float vol;
		float wei;
		Box v = new Box(5,6,7);
		vol = v.Volume();
        System.out.print("volume is: " + vol);
        BoxWeight w = new BoxWeight(5,6,7,8);
		wei = w.Weight();
        System.out.println("Weight is: " + wei);


	}
}