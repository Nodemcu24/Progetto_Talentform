package com.local.classes;

public class Geometria {

	public abstract static class Figura {

		public abstract double Area();

		public static void calcolaAreaCerchio(double raggio) {

			class cerchio extends Figura {

				@Override
				public double Area() {

					return Math.PI * raggio * raggio;
				}
			}
			Figura a = new cerchio();
			System.out.println("L' area del cerchio è: " + a.Area());
		}

		public static void main(String[] args) {
			calcolaAreaCerchio(5.0);
		}

	}

}
