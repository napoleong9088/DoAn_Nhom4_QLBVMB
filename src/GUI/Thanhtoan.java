package GUI;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import BLL.ChuyenBayBLL;
import BLL.KhachHangBLL;
import BLL.MayBayBLL;
import BLL.TuyenBayBLL;
import DTO.ChuyenBayDTO;
import DTO.KhachHangDTO;
import DTO.MayBayDTO;
import DTO.TuyenBayDTO;
import DTO.VeChuyenBayDTO;

import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.sql.Date;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Thanhtoan extends JFrame{
	private JPanel contentPane;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTable table ;
	private JTextField txtma_cb;
    

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Thanhtoan frame = new Thanhtoan();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Thanhtoan() throws ClassNotFoundException {
		font();
		//loadAllChuyenBay();
		//getkh(khDto);
	}
	

	public void  font() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
	     contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Thông tin chuyến bay \n");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(10, 11, 170, 22);
		lblNewLabel.setForeground(new Color(57,153,255));
		contentPane.add(lblNewLabel,BorderLayout.NORTH);
		
		
		JLabel lblNewLabel_0_1 = new JLabel("_________________________________________________________________________________\n");
		lblNewLabel_0_1.setBounds(8, 15, 600, 22);
		lblNewLabel_0_1.setForeground(new Color(57,153,255));
		contentPane.add(lblNewLabel_0_1);
		
		
		JLabel lblNewLabel_3 = new JLabel("<_Điểm Đi__ __________ \n");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setBounds(235, 40, 300, 22);
		lblNewLabel_3.setForeground(new Color(57,153,255));
		contentPane.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(246, 72, 95, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3_1 = new JLabel("__Điểm Đến_> \n");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3_1.setBounds(387, 39, 120, 22);
		lblNewLabel_3_1.setForeground(new Color(57,153,255));
		contentPane.add(lblNewLabel_3_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(400, 72, 100, 20);
		contentPane.add(textField_3);
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		
		JLabel lblNewLabel_7 = new JLabel("Thông tin khách hàng\n");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_7.setBounds(10, 145, 200, 22);
		lblNewLabel_7.setForeground(new Color(57,153,255));
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_7_1 = new JLabel("_________________________________________________________________________________\n");
		lblNewLabel_7_1.setBounds(8, 148, 600, 22);
		lblNewLabel_7_1.setForeground(new Color(57,153,255));
		contentPane.add(lblNewLabel_7_1);
		
		JLabel lblNewLabel_8= new JLabel("Họ và tên");
		lblNewLabel_8.setBounds(10, 175, 100, 22);
		contentPane.add(lblNewLabel_8);
		
		
		JLabel lblNewLabel_9= new JLabel("Ví dụ:Nguyễn Văn Thành");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_9.setBounds(10, 195, 200, 22);
		contentPane.add(lblNewLabel_9);
		
		textField_5 = new JTextField();
		textField_5.setBounds(10, 220, 150, 25);
		textField_5.setColumns(10);
		contentPane.add(textField_5);
		
		JLabel lblNewLabel_10 = new JLabel("CMND/PP");
		lblNewLabel_10.setBounds(200, 177, 70, 14);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11= new JLabel("Ví dụ:351000000");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_11.setBounds(200, 195, 200, 22);
		contentPane.add(lblNewLabel_11);
		
		textField_6 = new JTextField();
		textField_6.setBounds(200, 220, 150, 25);
		textField_6.setColumns(10);
		contentPane.add(textField_6);
	
     	JLabel lblThngTinLin = new JLabel("___Thông tin liên hệ___\n");
		lblThngTinLin.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblThngTinLin.setForeground(new Color(57,153,255));
		lblThngTinLin.setBounds(400, 170, 200, 22);
		contentPane.add(lblThngTinLin);
		
		JLabel lblNewLabel_13 = new JLabel("Số ĐT: \n");
		lblNewLabel_13.setBounds(400, 200, 83, 14);
		contentPane.add(lblNewLabel_13);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(450, 200, 120, 20);
		contentPane.add(textField_7);
		
		JLabel lblNewLabel_14 = new JLabel("Email: \n");
		lblNewLabel_14.setBounds(400, 230, 83, 14);
		contentPane.add(lblNewLabel_14);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(450, 230, 120, 20);
		contentPane.add(textField_8);
		
		JLabel lblNewLabel_15 = new JLabel("Chú ý !\n");
		lblNewLabel_15.setBounds(10, 263, 83, 14);
		lblNewLabel_15.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_15.setForeground(Color.RED);
		contentPane.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("Hành lý xách tay     Mỗi hành khách được đem tối đa 7kg hành lý xách tay.\n");
		lblNewLabel_16.setBounds(10, 290, 500, 17);
		lblNewLabel_16.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(lblNewLabel_16);
		
		JLabel lblNewLabel_18 = new JLabel("Hành lý ký gửi         Mỗi hành khách được đem tối đa 20kg hành lý ký gửi.\n");
		lblNewLabel_18.setBounds(10, 315, 500, 17);
		lblNewLabel_18.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(lblNewLabel_18);
		
		JButton btnNewButton = new JButton("THANH TOÁN");
		btnNewButton.setBounds(455, 285, 120, 50);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(57,153,255));
         contentPane.add(btnNewButton);
         
         JScrollPane scrollPane = new JScrollPane();
         scrollPane.setBounds(10, 102, 566, 48);
         contentPane.add(scrollPane);
         
        table =new JTable();
        //loadAllChuyenBay();
        scrollPane.setViewportView(table);
        
        txtma_cb = new JTextField();
        txtma_cb.setColumns(10);
        txtma_cb.setBounds(104, 43, 120, 20);
        contentPane.add(txtma_cb);
        
        JLabel tblma_cb = new JLabel("Mã chuyến bay");
        tblma_cb.setBounds(10, 43, 100, 14);
        contentPane.add(tblma_cb);
	}
	public void loadAllChuyenBay(String cb) throws ClassNotFoundException {
		
		 //tạo control DefaultTableModel để hiển thị danh sách ChuyenBay
	 String[] header = { "Mã chuyến bay", "Máy Bay","Ngày giờ", "Thời gian bay","Điểm đi","Điểm đến","Loại vé"};
	 DefaultTableModel dtm = new DefaultTableModel(header, 0);
	 //lấy danh sách ChuyenBayDTO (gọi hàm getAllChuyenBay() trong ChuyenBayBLL)
	 ArrayList<ChuyenBayDTO> arr = new ArrayList<ChuyenBayDTO>();
	 ChuyenBayBLL ChuyenBayBLL = new ChuyenBayBLL();
	//Duyệt mảng ChuyenBayDTO vừa lấy được: arr
	 ChuyenBayDTO ChuyenBayDTO = new ChuyenBayDTO();
	 ChuyenBayDTO.setMa_cb(cb);	 
	 arr = ChuyenBayBLL.getChuyenBayByma_cb(ChuyenBayDTO);
	 
	 TuyenBayDTO TuyenBayDTO = new TuyenBayDTO();
	 ArrayList<TuyenBayDTO> tuyenbay = new ArrayList<TuyenBayDTO>();
	 TuyenBayBLL TuyenBayBLL = new TuyenBayBLL();
	 
	 MayBayDTO MayBayDTO = new MayBayDTO();
	 ArrayList<MayBayDTO> maybay = new ArrayList<MayBayDTO>();
	 MayBayBLL MayBayBLL = new MayBayBLL();
	 
	 for (int i = 0; i < arr.size(); i++) {
		 ChuyenBayDTO = arr.get(i);
		 
		 String ma_cb = ChuyenBayDTO.getMa_cb();
		 Date ngaygio = (Date) ChuyenBayDTO.getNgaygio();
		 String thoigianbay = ChuyenBayDTO.getThoigianbay();
		 String ma_mb = ChuyenBayDTO.getMa_mb();
		 String ma_tb = ChuyenBayDTO.getMa_tuyenbay();
		 TuyenBayDTO.setMa_tuyenbay(ma_tb);
		 MayBayDTO.setMa_mb(ma_mb);
		 
		 maybay = MayBayBLL.getMayBayByma_mb(MayBayDTO);
		 MayBayDTO = maybay.get(0);
		 String ten_mb = MayBayDTO.getTen_mb();
		 
		 tuyenbay = TuyenBayBLL.getTuyenBayByma_tuyenbay(TuyenBayDTO);
		 TuyenBayDTO = tuyenbay.get(0);
		 String diem_di = TuyenBayDTO.getSanbaydi();
		 String diem_den = TuyenBayDTO.getSanbayden();
		 
		 textField_2.setText(diem_di);
		 textField_3.setText(diem_den);
		 //tạo row để add vào control DefaultTableModel
		 Object[] row = { ma_cb, ten_mb,ngaygio, thoigianbay,diem_di,diem_den};
		 dtm.addRow(row);
	 }
	 table.setModel(dtm);
	 }
	public void getkh(KhachHangDTO khDto) throws ClassNotFoundException {
		/*ArrayList<KhachHangDTO> kh = new ArrayList<KhachHangDTO>();
		KhachHangBLL khbll = new KhachHangBLL();
		kh = khbll.getKhachHangByma_kh(khDto);
		khDto= kh.get(0);*/
		textField_5.setText(khDto.getTen_kh());
		textField_8.setText(khDto.getEmail());
		textField_6.setText(khDto.getCmnd());
		textField_7.setText(khDto.getSDT());
	}
	public void getcb(ChuyenBayDTO cb) throws ClassNotFoundException {
		txtma_cb.setText(cb.getMa_cb());
		loadAllChuyenBay(cb.getMa_cb());
		
	}
}