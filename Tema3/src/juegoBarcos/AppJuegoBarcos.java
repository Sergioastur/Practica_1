package juegoBarcos;
import javax.swing.JOptionPane;

public class AppJuegoBarcos {

	public static void main(String[] args) {
		String[] portaaviones1 = new String[5];
		String[] acorazado1 = new String[4];
		String[] submarino1 = new String[3];
		String[] destructor1 = new String[2];
		String[] portaaviones2 = new String[5];
		String[] acorazado2 = new String[4];
		String[] submarino2 = new String[3];
		String[] destructor2 = new String[2];
		
		String cpp1, cfp1;
		int v1, v2;
		do {
			JOptionPane.showMessageDialog(null,"JUGADOR 1");
			cpp1=JOptionPane.showInputDialog("Cordenada principio portaaviones:");
			cfp1=JOptionPane.showInputDialog("Cordenada final portaaviones:");
			if (cpp1.charAt(0)==cfp1.charAt(0)) {
				if((int)cfp1.charAt(1)-(int)cpp1.charAt(1) == 4) {
					portaaviones1[0] = cpp1;
					portaaviones1[1] = cpp1.charAt(0) + ("" + ((Character.getNumericValue(cpp1.charAt(1)))+1));
					portaaviones1[2] = cpp1.charAt(0) + ("" + ((Character.getNumericValue(cpp1.charAt(1)))+2));
					portaaviones1[3] = cpp1.charAt(0) + ("" + ((Character.getNumericValue(cpp1.charAt(1)))+3));
					portaaviones1[4] = cpp1.charAt(0) + ("" + ((Character.getNumericValue(cpp1.charAt(1)))+4));
					
				} else {
					JOptionPane.showMessageDialog(null,"Coordenadas invalidas");
				}
				
			} else if (cpp1.charAt(1)==cfp1.charAt(1)) {
				portaaviones1[0] = cpp1;
				portaaviones1[1] = (char)((int)cpp1.charAt(0)+1)+""+cpp1.charAt(1);
				portaaviones1[2] = (char)((int)cpp1.charAt(0)+2)+""+cpp1.charAt(1);
				portaaviones1[3] = (char)((int)cpp1.charAt(0)+3)+""+cpp1.charAt(1);
				portaaviones1[4] = (char)((int)cpp1.charAt(0)+4)+""+cpp1.charAt(1);
				
			} else {
				JOptionPane.showMessageDialog(null,"Coordenadas invalidas");
			}
			
			
			
			cpp1=JOptionPane.showInputDialog("Cordenada principio acorazado:");
			cfp1=JOptionPane.showInputDialog("Cordenada final acorazado:");
			if (cpp1.charAt(0)==cfp1.charAt(0)) {
				if((int)cfp1.charAt(1)-(int)cpp1.charAt(1) == 3) {
					acorazado1[0] = cpp1;
					acorazado1[1] = cpp1.charAt(0) + ("" + ((Character.getNumericValue(cpp1.charAt(1)))+1));
					acorazado1[2] = cpp1.charAt(0) + ("" + ((Character.getNumericValue(cpp1.charAt(1)))+2));
					acorazado1[3] = cpp1.charAt(0) + ("" + ((Character.getNumericValue(cpp1.charAt(1)))+3));
					
				} else {
					JOptionPane.showMessageDialog(null,"Coordenadas invalidas");
				}
				
			} else if (cpp1.charAt(1)==cfp1.charAt(1)) {
				acorazado1[0] = cpp1;
				acorazado1[1] = (char)((int)cpp1.charAt(0)+1)+""+cpp1.charAt(1);
				acorazado1[2] = (char)((int)cpp1.charAt(0)+2)+""+cpp1.charAt(1);
				acorazado1[3] = (char)((int)cpp1.charAt(0)+3)+""+cpp1.charAt(1);
				
			} else {
				JOptionPane.showMessageDialog(null,"Coordenadas invalidas");
			}
			
			
			
			cpp1=JOptionPane.showInputDialog("Cordenada principio submarino:");
			cfp1=JOptionPane.showInputDialog("Cordenada final submarino:");
			if (cpp1.charAt(0)==cfp1.charAt(0)) {
				if((int)cfp1.charAt(1)-(int)cpp1.charAt(1) == 2) {
					submarino1[0] = cpp1;
					submarino1[1] = cpp1.charAt(0) + ("" + ((Character.getNumericValue(cpp1.charAt(1)))+1));
					submarino1[2] = cpp1.charAt(0) + ("" + ((Character.getNumericValue(cpp1.charAt(1)))+2));
					
					
				} else {
					JOptionPane.showMessageDialog(null,"Coordenadas invalidas");
				}
				
			} else if (cpp1.charAt(1)==cfp1.charAt(1)) {
				submarino1[0] = cpp1;
				submarino1[1] = (char)((int)cpp1.charAt(0)+1)+""+cpp1.charAt(1);
				submarino1[2] = (char)((int)cpp1.charAt(0)+2)+""+cpp1.charAt(1);
				
				
			} else {
				JOptionPane.showMessageDialog(null,"Coordenadas invalidas");
			}
			
			
			cpp1=JOptionPane.showInputDialog("Cordenada principio destructor:");
			cfp1=JOptionPane.showInputDialog("Cordenada final destructor:");
			if (cpp1.charAt(0)==cfp1.charAt(0)) {
				if((int)cfp1.charAt(1)-(int)cpp1.charAt(1) == 1) {
					destructor1[0] = cpp1;
					destructor1[1] = cpp1.charAt(0) + ("" + ((Character.getNumericValue(cpp1.charAt(1)))+1));
					
					
					
				} else {
					JOptionPane.showMessageDialog(null,"Coordenadas invalidas");
				}
				
			} else if (cpp1.charAt(1)==cfp1.charAt(1)) {
				destructor1[0] = cpp1;
				destructor1[1] = (char)((int)cpp1.charAt(0)+1)+""+cpp1.charAt(1);
				
				
				
			} else {
				JOptionPane.showMessageDialog(null,"Coordenadas invalidas");
			}
			
		}while(portaaviones1[0] == null || acorazado1[0] == null || submarino1[0] == null || destructor1[0] == null);
			do {
			JOptionPane.showMessageDialog(null,"JUGADOR 2");
			cpp1=JOptionPane.showInputDialog("Cordenada principio portaaviones:");
			cfp1=JOptionPane.showInputDialog("Cordenada final portaaviones:");
			if (cpp1.charAt(0)==cfp1.charAt(0)) {
				if((int)cfp1.charAt(1)-(int)cpp1.charAt(1) == 4) {
					portaaviones2[0] = cpp1;
					portaaviones2[1] = cpp1.charAt(0) + ("" + ((Character.getNumericValue(cpp1.charAt(1)))+1));
					portaaviones2[2] = cpp1.charAt(0) + ("" + ((Character.getNumericValue(cpp1.charAt(1)))+2));
					portaaviones2[3] = cpp1.charAt(0) + ("" + ((Character.getNumericValue(cpp1.charAt(1)))+3));
					portaaviones2[4] = cpp1.charAt(0) + ("" + ((Character.getNumericValue(cpp1.charAt(1)))+4));
					
				} else {
					JOptionPane.showMessageDialog(null,"Coordenadas invalidas");
				}
				
			} else if (cpp1.charAt(1)==cfp1.charAt(1)) {
				portaaviones2[0] = cpp1;
				portaaviones2[1] = (char)((int)cpp1.charAt(0)+1)+""+cpp1.charAt(1);
				portaaviones2[2] = (char)((int)cpp1.charAt(0)+2)+""+cpp1.charAt(1);
				portaaviones2[3] = (char)((int)cpp1.charAt(0)+3)+""+cpp1.charAt(1);
				portaaviones2[4] = (char)((int)cpp1.charAt(0)+4)+""+cpp1.charAt(1);
				
			} else {
				JOptionPane.showMessageDialog(null,"Coordenadas invalidas");
			}
			
			
			
			cpp1=JOptionPane.showInputDialog("Cordenada principio acorazado:");
			cfp1=JOptionPane.showInputDialog("Cordenada final acorazado:");
			if (cpp1.charAt(0)==cfp1.charAt(0)) {
				if((int)cfp1.charAt(1)-(int)cpp1.charAt(1) == 3) {
					acorazado2[0] = cpp1;
					acorazado2[1] = cpp1.charAt(0) + ("" + ((Character.getNumericValue(cpp1.charAt(1)))+1));
					acorazado2[2] = cpp1.charAt(0) + ("" + ((Character.getNumericValue(cpp1.charAt(1)))+2));
					acorazado2[3] = cpp1.charAt(0) + ("" + ((Character.getNumericValue(cpp1.charAt(1)))+3));
					
				} else {
					JOptionPane.showMessageDialog(null,"Coordenadas invalidas");
				}
				
			} else if (cpp1.charAt(1)==cfp1.charAt(1)) {
				acorazado2[0] = cpp1;
				acorazado2[1] = (char)((int)cpp1.charAt(0)+1)+""+cpp1.charAt(1);
				acorazado2[2] = (char)((int)cpp1.charAt(0)+2)+""+cpp1.charAt(1);
				acorazado2[3] = (char)((int)cpp1.charAt(0)+3)+""+cpp1.charAt(1);
				
			} else {
				JOptionPane.showMessageDialog(null,"Coordenadas invalidas");
			}
			
			
			
			cpp1=JOptionPane.showInputDialog("Cordenada principio submarino:");
			cfp1=JOptionPane.showInputDialog("Cordenada final submarino:");
			if (cpp1.charAt(0)==cfp1.charAt(0)) {
				if((int)cfp1.charAt(1)-(int)cpp1.charAt(1) == 2) {
					submarino2[0] = cpp1;
					submarino2[1] = cpp1.charAt(0) + ("" + ((Character.getNumericValue(cpp1.charAt(1)))+1));
					submarino2[2] = cpp1.charAt(0) + ("" + ((Character.getNumericValue(cpp1.charAt(1)))+2));
					
					
				} else {
					JOptionPane.showMessageDialog(null,"Coordenadas invalidas");
				}
				
			} else if (cpp1.charAt(1)==cfp1.charAt(1)) {
				submarino2[0] = cpp1;
				submarino2[1] = (char)((int)cpp1.charAt(0)+1)+""+cpp1.charAt(1);
				submarino2[2] = (char)((int)cpp1.charAt(0)+2)+""+cpp1.charAt(1);
				
				
			} else {
				JOptionPane.showMessageDialog(null,"Coordenadas invalidas");
			}
			
			
			cpp1=JOptionPane.showInputDialog("Cordenada principio destructor:");
			cfp1=JOptionPane.showInputDialog("Cordenada final destructor:");
			if (cpp1.charAt(0)==cfp1.charAt(0)) {
				if((int)cfp1.charAt(1)-(int)cpp1.charAt(1) == 1) {
					destructor2[0] = cpp1;
					destructor2[1] = cpp1.charAt(0) + ("" + ((Character.getNumericValue(cpp1.charAt(1)))+1));
					
					
					
				} else {
					JOptionPane.showMessageDialog(null,"Coordenadas invalidas");
				}
				
			} else if (cpp1.charAt(1)==cfp1.charAt(1)) {
				destructor2[0] = cpp1;
				destructor2[1] = (char)((int)cpp1.charAt(0)+1)+""+cpp1.charAt(1);
				
				
				
			} else {
				JOptionPane.showMessageDialog(null,"Coordenadas invalidas");
			}
			}while(portaaviones2[0] == null || acorazado2[0] == null || submarino2[0] == null || destructor2[0] == null);
			
			v1=14;
			v2=14;
			
			while(v1!=0 && v2!=0) {
				boolean impacto = false;
				String dis=JOptionPane.showInputDialog("Cordenada disparo (juagador 1):");
				for (int i = 0; i < portaaviones2.length; i++) {
		            if (portaaviones2[i].equals(dis)) {
		            	if(!portaaviones2[i].equals("4x")) {
		            		impacto = true;
		            		v2--;
		            	}
		                portaaviones2[i] = "4x";
		                break;
		            }
				}
				
				for (int i = 0; i < acorazado2.length; i++) {
		            if (acorazado2[i].equals(dis)) {
		            	if(!acorazado2[i].equals("4x")) {
		            		impacto = true;
		            		v2--;
		            	}
		            	acorazado2[i] = "4x";
		                break;
		            }
				}
				
				for (int i = 0; i < submarino2.length; i++) {
		            if (submarino2[i].equals(dis)) {
		            	if(!submarino2[i].equals("4x")) {
		            		impacto = true;
		            		v2--;
		            	}
		            	submarino2[i] = "4x";
		                break;
		            }
				}
				
				for (int i = 0; i < destructor2.length; i++) {
		            if (destructor2[i].equals(dis)) {
		            	if(!destructor2[i].equals("4x")) {
		            		impacto = true;
		            		v2--;
		            	}
		            	destructor2[i] = "4x";
		                break;
		            }
				}
		
			

	
				if(impacto) {
					JOptionPane.showMessageDialog(null,"IMPACTO");
					impacto = false;
				} else {
					JOptionPane.showMessageDialog(null,"agua");
				}
				
				dis=JOptionPane.showInputDialog("Cordenada disparo (juagador 2):");
				for (int i = 0; i < portaaviones1.length; i++) {
		            if (portaaviones1[i].equals(dis)) {
		            	if(!portaaviones1[i].equals("4x")) {
		            		impacto = true;
		            		v1--;
		            	}
		                portaaviones1[i] = "4x";
		                break;
		            }
				}
				
				for (int i = 0; i < acorazado1.length; i++) {
		            if (acorazado1[i].equals(dis)) {
		            	if(!acorazado1[i].equals("4x")) {
		            		impacto = true;
		            		v1--;
		            	}
		            	acorazado1[i] = "4x";
		                break;
		            }
				}
				
				for (int i = 0; i < submarino1.length; i++) {
		            if (submarino1[i].equals(dis)) {
		            	if(!submarino1[i].equals("4x")) {
		            		impacto = true;
		            		v1--;
		            	}
		            	submarino1[i] = "4x";
		                break;
		            }
				}
				
				for (int i = 0; i < destructor1.length; i++) {
		            if (destructor1[i].equals(dis)) {
		            	if(!destructor1[i].equals("4x")) {
		            		impacto = true;
		            		v1--;
		            	}
		            	destructor1[i] = "4x";
		                break;
		            }
				}
				
				if(impacto) {
					JOptionPane.showMessageDialog(null,"IMPACTO");
					impacto = false;
				} else {
					JOptionPane.showMessageDialog(null,"agua");
				}
				
				
			}
			
			if (v1>v2) {
				JOptionPane.showMessageDialog(null,"GANA EL JUGADOR 1");
			} else {
				JOptionPane.showMessageDialog(null,"GANA EL JUGADOR 2");
			}
			
	}
}
