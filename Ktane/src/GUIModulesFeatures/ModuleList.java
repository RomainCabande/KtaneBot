package GUIModulesFeatures;

import java.util.ArrayList;
import java.util.List;

public class ModuleList {
	
	private String[] modules = {"Wires", "Module2", "Module3"};
	private List<String> listModules;
	
	public ModuleList() {
		this.listModules = new ArrayList<String>();
		for(int i = 0; i < this.modules.length; i++) {
			this.listModules.add(this.modules[i]);
		}
		this.listModules.sort(null);	
	}
	
	public List<String> getModulesList() {
		return this.listModules;
	}
	
	public String[] getModuleTab() {
		String [] tabbedList = new String[this.listModules.size()];
		for(int i = 0; i < this.listModules.size(); i++) {
			tabbedList[i] = this.listModules.get(i);
		}
		return tabbedList;
	}
	
	//used for testing
	public void displayModulesList() {
		for(int i = 0; i < this.listModules.size(); i ++) {
			System.out.println(this.listModules.get(i));
		}
	}
	
	public String[] searchModule(String keyword) {
		List<String> listOfFoundE = new ArrayList<String>();
		for(int i = 0; i < this.listModules.size(); i ++) {
			if(this.listModules.get(i).matches("(?i).*" + keyword + ".*")) {
				listOfFoundE.add(this.listModules.get(i));
			}
		}
		String[] listOfFoundElements = new String[listOfFoundE.size()];
		for(int i = 0; i < listOfFoundE.size(); i++) {
			listOfFoundElements[i] = listOfFoundE.get(i);
		}
		return listOfFoundElements;
	}
}
