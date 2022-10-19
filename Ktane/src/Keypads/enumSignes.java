package Keypads;

public enum enumSignes {
	LOLLIPOP("Ϙ"),
	AT("Ѧ"),
	LAMBDA("ƛ"),
	HP("Ϟ"),
	TTRIANGLE("Ѭ"),
	X("ϗ"),
	CPRETURN("Ͽ"),
	E2POINTS("Ӭ"),
	CL("Ҩ"),
	STARW("☆"),
	PTSRETURN("¿"),
	CCIRCLED("©"),
	DOG("Ѽ"),
	DOUBLEK("Җ"),
	R("Ԇ"),
	SIX("Ϭ"),
	P("¶"),
	TB("ѣ"),
	SMILEY("ټ"),
	CHANDELIER("Ψ"),
	CPTS("Ͼ"),
	TROIS("ѯ"),
	STARB("★"),
	EQUALSB("҂"),
	AE("ӕ"),
	NH("Ҋ"),
	OMEGA("Ω")
;
	private String value;
	
	enumSignes(String string) {
		// TODO Auto-generated constructor stub
		this.value = string;
	}
	
	public String toString() {
		return this.value;
	}
}
/*
Ϙ,Ѧ,ƛ,Ϟ,Ѭ,ϗ,Ͽ
Ӭ,Ϙ,Ͽ,Ҩ,☆,ϗ,¿
©,Ѽ,Ҩ,Җ,Ԇ,ƛ,☆
Ϭ,¶,ѣ,Ѭ,Җ,¿,ټ
Ψ,ټ,ѣ,Ͼ,¶,ѯ,★
Ϭ,Ӭ,҂,ӕ,Ψ,Ҋ,Ω
*/
