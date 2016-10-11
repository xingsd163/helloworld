package com;

import java.awt.BorderLayout;
import java.awt.EventQueue;

/*
 * 命令运行框示例
 * JLabel 标题可以是文字，也可以是图标
 * Opaque，不透明的，默认不显示，在高级选项
 * JComboBox 设置为可编辑，这样即可输入又可下拉选择
 */

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.UIManager;

public class RunDialogDemo extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//设置程序使用本地系统的外观样式
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					//设置程序使用跨平台的外观样式
					//UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
					RunDialogDemo frame = new RunDialogDemo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public RunDialogDemo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 493, 216);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("E:\\Workspaces\\AndroidProject\\JavaExamples01\\src\\com\\logo.jpg"));
		lblNewLabel.setBounds(39, 28, 41, 13);
		contentPane.add(lblNewLabel);
		
		JTextArea txtrinternetwindows = new JTextArea();
		txtrinternetwindows.setWrapStyleWord(true);
		txtrinternetwindows.setOpaque(false);
		txtrinternetwindows.setBackground(SystemColor.control);
		txtrinternetwindows.setLineWrap(true);
		txtrinternetwindows.setText("请输入程序、文件夹、文档或Internet资源的名称，Windows 将为您打开它。");
		txtrinternetwindows.setBounds(90, 28, 322, 46);
		contentPane.add(txtrinternetwindows);
		
		JLabel lblo = new JLabel("打开(O):");
		lblo.setBounds(35, 92, 55, 14);
		contentPane.add(lblo);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setEditable(true);
		comboBox.setBounds(100, 89, 288, 20);
		contentPane.add(comboBox);
		
		JButton btnNewButton = new JButton("确定");
		btnNewButton.setBounds(203, 130, 69, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("取消");
		btnNewButton_1.setBounds(282, 130, 69, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("浏览");
		btnNewButton_2.setBounds(361, 130, 73, 23);
		contentPane.add(btnNewButton_2);
	}
}
