class ArmstrongNumbers {

	boolean isArmstrongNumber(int numberToCheck) {

		if (numberToCheck < 10) return true;

		int [] digits = String.valueOf(numberToCheck).chars().toArray();
		int sum = 0;
		
		for (int digit : digits)
			sum += Math.pow(Character.getNumericValue(digit), digits.length);

		if (sum == numberToCheck) return true;

		return false;
		
	}

}
