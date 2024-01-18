package com.winter.app.member;

import com.winter.app.member.avatar.AvatarFileDTO;

public class MemberDTO {

		private String userName;
		private String passWord;
		private String name;
		private String email;
		private String phone;
		private String addRess;
		
		private AvatarFileDTO avatarFileDTO;

		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getPassWord() {
			return passWord;
		}
		public void setPassWord(String passWord) {
			this.passWord = passWord;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public String getAddRess() {
			return addRess;
		}
		public void setAddRess(String addRess) {
			this.addRess = addRess;
		}
		public AvatarFileDTO getAvatarFileDTO() {
			return avatarFileDTO;
		}
		public void setAvatarFileDTO(AvatarFileDTO avatarFileDTO) {
			this.avatarFileDTO = avatarFileDTO;
		}
}
