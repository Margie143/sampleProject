package com.PoolPuzzle4.qa;

class puzzle4b {
	int ivar;
	public int doStuff(int factor) {
		if (ivar > 100) {
			return ivar * factor;
		}else {
			return  ivar * (5 - factor);
		}
	}

}
