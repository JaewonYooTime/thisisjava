package ch09.sec07.exam03;

public class ButtonExample {
	public static void main(String[] args) {
		Button btnOk = new Button();
		
		btnOk.setClickListener(new Button.ClickListener() {
			@Override
			public void onClick() {
				System.out.println("OK 버튼을 클릭했습니다.");
			}
		});
		
		//OK 버튼 클릭하기
		btnOk.click();
		
		Button btnCancel = new Button();
		btnCancel.setClickListener(new Button.ClickListener() {
			@Override
			public void onClick() {
				System.out.println("Cancel 버튼을 클릭했습니다.");
			}
		});
		//Cancel 버튼 클릭하기
		btnCancel.click();
		
	}
}
