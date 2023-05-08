package memento.exemplo1.swing.component;

import memento.exemplo1.swing.memory.Memento;

import javax.swing.JTextArea;

public class TextAreaWithMemory extends JTextArea {
	private static final long serialVersionUID = 2393587108160522742L;
	
	public TextAreaWithMemory(int rows, int columns) {
		super(rows, columns);
	}

	public TextAreaMemento save(){

		return new TextAreaMemento(getText());
	}

	public void restore(TextAreaMemento memento){

		setText(memento.getState());
	}

	public static class TextAreaMemento implements Memento{
		
		private String text;

		public TextAreaMemento(String text) {

			this.text = text;
		}

		private String getState() {

			return text;
		}
	}
}
