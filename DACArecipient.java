/**
 * Represents one person receiving Deferred Action for Childhood Arrivals (DACA).
 * 
 *	@version 1.0
 **/

/* UML CLASS DIAGRAM:
-----------------------------------------

-----------------------------------------
- surname : String
- GivenName : String
- uscisNumber : String
- countryOfOrigin : String
- birthday : int
- validFromDate : int
- expirationDate: int
- sex: char
-----------------------------------------
+ getSurname() : String
+ getGivenName() : String
+ getUscisNumber() : String
+ getCountryOfOrigin() : String
+ getBirthday() : int
+ getValidFromDate() : int
+ getExpirationDate() : int
+ getSex() : char

+ setSurname(surname : String) : void
+ getGivenName(GivenName : String) : void
+ getUscisNumber(uscisNumber : String) : void
+ getCountryOfOrigin(countryOfOrigin : String) : void
+ getBirthday(birthday : int) : void
+ getValidFromDate(validFromDate : int) : void
+ getExpirationDate(expirationDate: int) : void
+ getSex(sex: char) : void

+ setAll(surname : String, GivenName : String, uscisNumber : String, countryOfOrigin : String,
birthday : int, validFromDate : int, expirationDate: int, sex: char) : void


-----------------------------------------
*/

public class DACArecipient
{
	/***** INSTANCE VARIABLES *****/
	
	private String surname;
	private String givenName;
	private String uscisNumber;
	private String countryOfOrigin;
	private int birthday, validFromDate, expirationDate;
	private char sex;


	/***** ACCESSORS *****/
	/**
	 * Retuns surname of calling objects
	 * 
	 * returns String representing surname
	 */
	public String getSurname() {
		return this.surname;
		}
		public String getGivenName() {
			return this.givenName;
		}
		public String getUscisNumber() {
			return this.uscisNumber;
		}
		public String getCountryOfOrigin() {
			return this.countryOfOrigin;
		}
		public int getBirthday() {
			return this.birthday;
		}
		public int getValidFromDate() {
			return this.validFromDate;
		}
		public int getExpirationDate() {
			return this.expirationDate;
		}
		public char getSex() {
			return this.sex;
		}
	
	/***** MUTATORS *****/
	//+ setSurname(surname : String) : void
	/**
	 * Sets surname to parameter value of calling object
	 * 
	 * @param surname String representing last name, assume exists and is valid
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}
	 public void setGivenName(String givenName) {
		this.givenName = givenName;
	 }
	 public void setUscisNumber(String usciNumber) {
		this.uscisNumber = usciNumber;
	 }
	 public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	 }
	 public void setBirthday(int birthday) {
		this.birthday = birthday;
	 }
	 public void setValidFromDate(int validFromDate) {
		this.validFromDate = validFromDate;
	 }
	 public void setExpirationDate(int expirationDate) {
		this.expirationDate = expirationDate;
	 }
	 public void setSex(char sex) {
		this.sex = sex;
	 }

	//+ setAll(surname : String, GivenName : String, uscisNumber : String, countryOfOrigin : String,
	//birthday : int, validFromDate : int, expirationDate: int, sex: char) : void
	/**
	 * sets all data objects
	 * 
	 * @param surname String representing last name, assume it exists and is valid
	 * @param givenName String representing first name, assume it exists and is valid
	 * @param uscisNumber String representing 3-part USCIS number, with dashes
	 * @param countryOfOrigin country name, assume valid country
	 * @param birthday Julian day number for birthday
	 * @param validFromDate Julian day number for valid from date
	 * @param expirationDate Julian day number for expiration date
	 * @param sex representing sex
	 */
	public void setAll(String surname, String givenName, String uscisNumber, String countryOfOrigin, 
	int birthday, int validFromDate, int expirationDate, char sex) {
		this.setSurname(surname);
		this.setGivenName(givenName);
		this.setUscisNumber(uscisNumber);
		this.setCountryOfOrigin(countryOfOrigin);
		this.setBirthday(birthday);
		this.setValidFromDate(validFromDate);
		this.setExpirationDate(expirationDate);
		this.setSex(sex);
	}
}