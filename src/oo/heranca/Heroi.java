package oo.heranca;

public class Heroi extends Jogador{
	
//	boolean atacar(Jogador oponente){
//		int deltaX = Math.abs(x - oponente.x);
//		int deltaY = Math.abs(y - oponente.y);
//		
//		if (deltaX == 0 && deltaY == 1) {
//			oponente.vida -= 20;
//			return true;
//		}
//		
//		if (deltaX == 1 && deltaY == 0) {
//			oponente.vida -= 20;
//			return true;
//		}
//	
//		return false;
//	}

	public Heroi(int x, int y) {
		super(x, y);
	}
	
	public boolean atacar(Jogador oponente){
		boolean ataque1 = super.atacar(oponente);
		System.out.println(ataque1);
 		boolean ataque2 = super.atacar(oponente);
		boolean ataque3 = super.atacar(oponente);
		
		
		return ataque1 || ataque2 || ataque3;
	}
}
