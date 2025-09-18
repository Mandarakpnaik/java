class Trainer
{
	public String trainerName;
	public int trainerSalary;
	public Trainee batch;
	
	public Trainer(String trainerName,int trainerSalary,float rating,Trainee batch)
	{
		this.trainerName=trainerName;
		this.trainerSalary=trainerSalary;
		this.rating=rating;
		this.batch=batch;
	}
	public void displayTrainer()
	{
		System.out.println("Trainer name :"+trainerName+ ","+"Trainer salary :"+trainerSalary);
		System.out.println("Batch name :"+batch.batchName+ ","+"Number of Student :"+batch.noOfStudent);
	}
}