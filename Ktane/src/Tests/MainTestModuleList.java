package Tests;

import java.util.Scanner;

import GUIModulesFeatures.ModuleList;

public class MainTestModuleList {

	public static void main(String[] args) {
		ModuleList allModules = new ModuleList();
		System.out.println("Voici la liste complète des modules :\n");
		allModules.displayModulesList();
		System.out.println("*********************************");
		System.out.println("tapez le nom d'un module pour le chercher :");
		Scanner scan = new Scanner(System.in);
		String keyword = scan.nextLine();
		System.out.println(allModules.searchModule(keyword).toString());
		scan.close();
	}

}
