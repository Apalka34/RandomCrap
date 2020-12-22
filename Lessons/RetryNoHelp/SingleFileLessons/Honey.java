package SingleFileLessons;

class Bees {
	Honey[] beeHa;
}

class Raccoon {
	Kit k;
	Honey rh;
}

class Kit {
	Honey kh;
}

class Bear {
	Honey hunny;
}

public class Honey {
	public static void main(String[] args) {

		Honey honeyPot = new Honey();
		Honey[] ha = { honeyPot, honeyPot, honeyPot, honeyPot };//beeH
		Bees b1 = new Bees();//beeHa 
		b1.beeHa = ha;//beeHa
		Bear[] ba = new Bear[5];

		for (int x = 0; x < 5; x++) {
			ba[x] = new Bear();
			ba[x].hunny = honeyPot;//hunny
		}

		Kit k = new Kit();//k
		k.kh = honeyPot;//k, kh
		Raccoon r = new Raccoon();//r

		r.rh = honeyPot;//rh, r
		r.k = k;//k, rh, r
		k = null;//k
	}
}

//Guess: k

//Answer: Honey