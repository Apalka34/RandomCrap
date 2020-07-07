package PoolPuzzle;//PAGE 232

interface Nose {
	public int iMethod();
	}
//_________________________________________________________________
abstract class Picasso implements Nose{
	public int iMethod() {
	return 7;
	}
}
//_________________________________________________________________
class Clowns extends Picasso { }
//_________________________________________________________________
class Acts extends Picasso {
	public int iMethod() {
	return 5;
	}
}
