class TrainerRunner
{
	public static void main(String [] ref)
	{
		Trainee trainee = new Trainee("C25",20);
		Trainer trainer = new Trainer("Anil",15000,3.5f,trainee);
		trainer.displayTrainer();
	}
}