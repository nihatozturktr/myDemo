package hoofdstuk_11_De_opsomming;

public class userManager {

    String userName = "admin", userPass = "admin123";
    int authority = 1;

    enum staffMembers {
        ADMINISTRATION (1),
        SUPERMODERATOR (2),
        MODERATOR (3),
        MEMBER (4); // Enum elemanları arasında virgül konur.
        private int staffRank;
        staffMembers(int staffRank) {
            this.staffRank = staffRank;
        }
        public int getStaffRank(){
            return staffRank;
        }
    }
// Main yukarısına yazacağımız Java Enum tanımlaması.
}
