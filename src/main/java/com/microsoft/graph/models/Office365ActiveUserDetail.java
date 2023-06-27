package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Office365ActiveUserDetail extends Entity implements Parsable {
    /**
     * All the products assigned for the user.
     */
    private java.util.List<String> assignedProducts;
    /**
     * The date when the delete operation happened. Default value is 'null' when the user has not been deleted.
     */
    private LocalDate deletedDate;
    /**
     * The name displayed in the address book for the user. This is usually the combination of the user's first name, middle initial, and last name. This property is required when a user is created and it cannot be cleared during updates.
     */
    private String displayName;
    /**
     * The date when user last read or sent email.
     */
    private LocalDate exchangeLastActivityDate;
    /**
     * The last date when the user was assigned an Exchange license.
     */
    private LocalDate exchangeLicenseAssignDate;
    /**
     * Whether the user has been assigned an Exchange license.
     */
    private Boolean hasExchangeLicense;
    /**
     * Whether the user has been assigned a OneDrive license.
     */
    private Boolean hasOneDriveLicense;
    /**
     * Whether the user has been assigned a SharePoint license.
     */
    private Boolean hasSharePointLicense;
    /**
     * Whether the user has been assigned a Skype For Business license.
     */
    private Boolean hasSkypeForBusinessLicense;
    /**
     * Whether the user has been assigned a Teams license.
     */
    private Boolean hasTeamsLicense;
    /**
     * Whether the user has been assigned a Yammer license.
     */
    private Boolean hasYammerLicense;
    /**
     * Whether this user has been deleted or soft deleted.
     */
    private Boolean isDeleted;
    /**
     * The date when user last viewed or edited files, shared files internally or externally, or synced files.
     */
    private LocalDate oneDriveLastActivityDate;
    /**
     * The last date when the user was assigned a OneDrive license.
     */
    private LocalDate oneDriveLicenseAssignDate;
    /**
     * The latest date of the content.
     */
    private LocalDate reportRefreshDate;
    /**
     * The date when user last viewed or edited files, shared files internally or externally, synced files, or viewed SharePoint pages.
     */
    private LocalDate sharePointLastActivityDate;
    /**
     * The last date when the user was assigned a SharePoint license.
     */
    private LocalDate sharePointLicenseAssignDate;
    /**
     * The date when user last organized or participated in conferences, or joined peer-to-peer sessions.
     */
    private LocalDate skypeForBusinessLastActivityDate;
    /**
     * The last date when the user was assigned a Skype For Business license.
     */
    private LocalDate skypeForBusinessLicenseAssignDate;
    /**
     * The date when user last posted messages in team channels, sent messages in private chat sessions, or participated in meetings or calls.
     */
    private LocalDate teamsLastActivityDate;
    /**
     * The last date when the user was assigned a Teams license.
     */
    private LocalDate teamsLicenseAssignDate;
    /**
     * The user principal name (UPN) of the user. The UPN is an Internet-style login name for the user based on the Internet standard RFC 822. By convention, this should map to the user's email name. The general format is alias@domain, where domain must be present in the tenants collection of verified domains. This property is required when a user is created.
     */
    private String userPrincipalName;
    /**
     * The date when user last posted, read, or liked message.
     */
    private LocalDate yammerLastActivityDate;
    /**
     * The last date when the user was assigned a Yammer license.
     */
    private LocalDate yammerLicenseAssignDate;
    /**
     * Instantiates a new Office365ActiveUserDetail and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Office365ActiveUserDetail() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Office365ActiveUserDetail
     */
    @javax.annotation.Nonnull
    public static Office365ActiveUserDetail createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Office365ActiveUserDetail();
    }
    /**
     * Gets the assignedProducts property value. All the products assigned for the user.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getAssignedProducts() {
        return this.assignedProducts;
    }
    /**
     * Gets the deletedDate property value. The date when the delete operation happened. Default value is 'null' when the user has not been deleted.
     * @return a LocalDate
     */
    @javax.annotation.Nullable
    public LocalDate getDeletedDate() {
        return this.deletedDate;
    }
    /**
     * Gets the displayName property value. The name displayed in the address book for the user. This is usually the combination of the user's first name, middle initial, and last name. This property is required when a user is created and it cannot be cleared during updates.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Gets the exchangeLastActivityDate property value. The date when user last read or sent email.
     * @return a LocalDate
     */
    @javax.annotation.Nullable
    public LocalDate getExchangeLastActivityDate() {
        return this.exchangeLastActivityDate;
    }
    /**
     * Gets the exchangeLicenseAssignDate property value. The last date when the user was assigned an Exchange license.
     * @return a LocalDate
     */
    @javax.annotation.Nullable
    public LocalDate getExchangeLicenseAssignDate() {
        return this.exchangeLicenseAssignDate;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("assignedProducts", (n) -> { this.setAssignedProducts(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("deletedDate", (n) -> { this.setDeletedDate(n.getLocalDateValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("exchangeLastActivityDate", (n) -> { this.setExchangeLastActivityDate(n.getLocalDateValue()); });
        deserializerMap.put("exchangeLicenseAssignDate", (n) -> { this.setExchangeLicenseAssignDate(n.getLocalDateValue()); });
        deserializerMap.put("hasExchangeLicense", (n) -> { this.setHasExchangeLicense(n.getBooleanValue()); });
        deserializerMap.put("hasOneDriveLicense", (n) -> { this.setHasOneDriveLicense(n.getBooleanValue()); });
        deserializerMap.put("hasSharePointLicense", (n) -> { this.setHasSharePointLicense(n.getBooleanValue()); });
        deserializerMap.put("hasSkypeForBusinessLicense", (n) -> { this.setHasSkypeForBusinessLicense(n.getBooleanValue()); });
        deserializerMap.put("hasTeamsLicense", (n) -> { this.setHasTeamsLicense(n.getBooleanValue()); });
        deserializerMap.put("hasYammerLicense", (n) -> { this.setHasYammerLicense(n.getBooleanValue()); });
        deserializerMap.put("isDeleted", (n) -> { this.setIsDeleted(n.getBooleanValue()); });
        deserializerMap.put("oneDriveLastActivityDate", (n) -> { this.setOneDriveLastActivityDate(n.getLocalDateValue()); });
        deserializerMap.put("oneDriveLicenseAssignDate", (n) -> { this.setOneDriveLicenseAssignDate(n.getLocalDateValue()); });
        deserializerMap.put("reportRefreshDate", (n) -> { this.setReportRefreshDate(n.getLocalDateValue()); });
        deserializerMap.put("sharePointLastActivityDate", (n) -> { this.setSharePointLastActivityDate(n.getLocalDateValue()); });
        deserializerMap.put("sharePointLicenseAssignDate", (n) -> { this.setSharePointLicenseAssignDate(n.getLocalDateValue()); });
        deserializerMap.put("skypeForBusinessLastActivityDate", (n) -> { this.setSkypeForBusinessLastActivityDate(n.getLocalDateValue()); });
        deserializerMap.put("skypeForBusinessLicenseAssignDate", (n) -> { this.setSkypeForBusinessLicenseAssignDate(n.getLocalDateValue()); });
        deserializerMap.put("teamsLastActivityDate", (n) -> { this.setTeamsLastActivityDate(n.getLocalDateValue()); });
        deserializerMap.put("teamsLicenseAssignDate", (n) -> { this.setTeamsLicenseAssignDate(n.getLocalDateValue()); });
        deserializerMap.put("userPrincipalName", (n) -> { this.setUserPrincipalName(n.getStringValue()); });
        deserializerMap.put("yammerLastActivityDate", (n) -> { this.setYammerLastActivityDate(n.getLocalDateValue()); });
        deserializerMap.put("yammerLicenseAssignDate", (n) -> { this.setYammerLicenseAssignDate(n.getLocalDateValue()); });
        return deserializerMap;
    }
    /**
     * Gets the hasExchangeLicense property value. Whether the user has been assigned an Exchange license.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getHasExchangeLicense() {
        return this.hasExchangeLicense;
    }
    /**
     * Gets the hasOneDriveLicense property value. Whether the user has been assigned a OneDrive license.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getHasOneDriveLicense() {
        return this.hasOneDriveLicense;
    }
    /**
     * Gets the hasSharePointLicense property value. Whether the user has been assigned a SharePoint license.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getHasSharePointLicense() {
        return this.hasSharePointLicense;
    }
    /**
     * Gets the hasSkypeForBusinessLicense property value. Whether the user has been assigned a Skype For Business license.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getHasSkypeForBusinessLicense() {
        return this.hasSkypeForBusinessLicense;
    }
    /**
     * Gets the hasTeamsLicense property value. Whether the user has been assigned a Teams license.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getHasTeamsLicense() {
        return this.hasTeamsLicense;
    }
    /**
     * Gets the hasYammerLicense property value. Whether the user has been assigned a Yammer license.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getHasYammerLicense() {
        return this.hasYammerLicense;
    }
    /**
     * Gets the isDeleted property value. Whether this user has been deleted or soft deleted.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsDeleted() {
        return this.isDeleted;
    }
    /**
     * Gets the oneDriveLastActivityDate property value. The date when user last viewed or edited files, shared files internally or externally, or synced files.
     * @return a LocalDate
     */
    @javax.annotation.Nullable
    public LocalDate getOneDriveLastActivityDate() {
        return this.oneDriveLastActivityDate;
    }
    /**
     * Gets the oneDriveLicenseAssignDate property value. The last date when the user was assigned a OneDrive license.
     * @return a LocalDate
     */
    @javax.annotation.Nullable
    public LocalDate getOneDriveLicenseAssignDate() {
        return this.oneDriveLicenseAssignDate;
    }
    /**
     * Gets the reportRefreshDate property value. The latest date of the content.
     * @return a LocalDate
     */
    @javax.annotation.Nullable
    public LocalDate getReportRefreshDate() {
        return this.reportRefreshDate;
    }
    /**
     * Gets the sharePointLastActivityDate property value. The date when user last viewed or edited files, shared files internally or externally, synced files, or viewed SharePoint pages.
     * @return a LocalDate
     */
    @javax.annotation.Nullable
    public LocalDate getSharePointLastActivityDate() {
        return this.sharePointLastActivityDate;
    }
    /**
     * Gets the sharePointLicenseAssignDate property value. The last date when the user was assigned a SharePoint license.
     * @return a LocalDate
     */
    @javax.annotation.Nullable
    public LocalDate getSharePointLicenseAssignDate() {
        return this.sharePointLicenseAssignDate;
    }
    /**
     * Gets the skypeForBusinessLastActivityDate property value. The date when user last organized or participated in conferences, or joined peer-to-peer sessions.
     * @return a LocalDate
     */
    @javax.annotation.Nullable
    public LocalDate getSkypeForBusinessLastActivityDate() {
        return this.skypeForBusinessLastActivityDate;
    }
    /**
     * Gets the skypeForBusinessLicenseAssignDate property value. The last date when the user was assigned a Skype For Business license.
     * @return a LocalDate
     */
    @javax.annotation.Nullable
    public LocalDate getSkypeForBusinessLicenseAssignDate() {
        return this.skypeForBusinessLicenseAssignDate;
    }
    /**
     * Gets the teamsLastActivityDate property value. The date when user last posted messages in team channels, sent messages in private chat sessions, or participated in meetings or calls.
     * @return a LocalDate
     */
    @javax.annotation.Nullable
    public LocalDate getTeamsLastActivityDate() {
        return this.teamsLastActivityDate;
    }
    /**
     * Gets the teamsLicenseAssignDate property value. The last date when the user was assigned a Teams license.
     * @return a LocalDate
     */
    @javax.annotation.Nullable
    public LocalDate getTeamsLicenseAssignDate() {
        return this.teamsLicenseAssignDate;
    }
    /**
     * Gets the userPrincipalName property value. The user principal name (UPN) of the user. The UPN is an Internet-style login name for the user based on the Internet standard RFC 822. By convention, this should map to the user's email name. The general format is alias@domain, where domain must be present in the tenants collection of verified domains. This property is required when a user is created.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserPrincipalName() {
        return this.userPrincipalName;
    }
    /**
     * Gets the yammerLastActivityDate property value. The date when user last posted, read, or liked message.
     * @return a LocalDate
     */
    @javax.annotation.Nullable
    public LocalDate getYammerLastActivityDate() {
        return this.yammerLastActivityDate;
    }
    /**
     * Gets the yammerLicenseAssignDate property value. The last date when the user was assigned a Yammer license.
     * @return a LocalDate
     */
    @javax.annotation.Nullable
    public LocalDate getYammerLicenseAssignDate() {
        return this.yammerLicenseAssignDate;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfPrimitiveValues("assignedProducts", this.getAssignedProducts());
        writer.writeLocalDateValue("deletedDate", this.getDeletedDate());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeLocalDateValue("exchangeLastActivityDate", this.getExchangeLastActivityDate());
        writer.writeLocalDateValue("exchangeLicenseAssignDate", this.getExchangeLicenseAssignDate());
        writer.writeBooleanValue("hasExchangeLicense", this.getHasExchangeLicense());
        writer.writeBooleanValue("hasOneDriveLicense", this.getHasOneDriveLicense());
        writer.writeBooleanValue("hasSharePointLicense", this.getHasSharePointLicense());
        writer.writeBooleanValue("hasSkypeForBusinessLicense", this.getHasSkypeForBusinessLicense());
        writer.writeBooleanValue("hasTeamsLicense", this.getHasTeamsLicense());
        writer.writeBooleanValue("hasYammerLicense", this.getHasYammerLicense());
        writer.writeBooleanValue("isDeleted", this.getIsDeleted());
        writer.writeLocalDateValue("oneDriveLastActivityDate", this.getOneDriveLastActivityDate());
        writer.writeLocalDateValue("oneDriveLicenseAssignDate", this.getOneDriveLicenseAssignDate());
        writer.writeLocalDateValue("reportRefreshDate", this.getReportRefreshDate());
        writer.writeLocalDateValue("sharePointLastActivityDate", this.getSharePointLastActivityDate());
        writer.writeLocalDateValue("sharePointLicenseAssignDate", this.getSharePointLicenseAssignDate());
        writer.writeLocalDateValue("skypeForBusinessLastActivityDate", this.getSkypeForBusinessLastActivityDate());
        writer.writeLocalDateValue("skypeForBusinessLicenseAssignDate", this.getSkypeForBusinessLicenseAssignDate());
        writer.writeLocalDateValue("teamsLastActivityDate", this.getTeamsLastActivityDate());
        writer.writeLocalDateValue("teamsLicenseAssignDate", this.getTeamsLicenseAssignDate());
        writer.writeStringValue("userPrincipalName", this.getUserPrincipalName());
        writer.writeLocalDateValue("yammerLastActivityDate", this.getYammerLastActivityDate());
        writer.writeLocalDateValue("yammerLicenseAssignDate", this.getYammerLicenseAssignDate());
    }
    /**
     * Sets the assignedProducts property value. All the products assigned for the user.
     * @param value Value to set for the assignedProducts property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAssignedProducts(@javax.annotation.Nullable final java.util.List<String> value) {
        this.assignedProducts = value;
    }
    /**
     * Sets the deletedDate property value. The date when the delete operation happened. Default value is 'null' when the user has not been deleted.
     * @param value Value to set for the deletedDate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeletedDate(@javax.annotation.Nullable final LocalDate value) {
        this.deletedDate = value;
    }
    /**
     * Sets the displayName property value. The name displayed in the address book for the user. This is usually the combination of the user's first name, middle initial, and last name. This property is required when a user is created and it cannot be cleared during updates.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the exchangeLastActivityDate property value. The date when user last read or sent email.
     * @param value Value to set for the exchangeLastActivityDate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExchangeLastActivityDate(@javax.annotation.Nullable final LocalDate value) {
        this.exchangeLastActivityDate = value;
    }
    /**
     * Sets the exchangeLicenseAssignDate property value. The last date when the user was assigned an Exchange license.
     * @param value Value to set for the exchangeLicenseAssignDate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExchangeLicenseAssignDate(@javax.annotation.Nullable final LocalDate value) {
        this.exchangeLicenseAssignDate = value;
    }
    /**
     * Sets the hasExchangeLicense property value. Whether the user has been assigned an Exchange license.
     * @param value Value to set for the hasExchangeLicense property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHasExchangeLicense(@javax.annotation.Nullable final Boolean value) {
        this.hasExchangeLicense = value;
    }
    /**
     * Sets the hasOneDriveLicense property value. Whether the user has been assigned a OneDrive license.
     * @param value Value to set for the hasOneDriveLicense property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHasOneDriveLicense(@javax.annotation.Nullable final Boolean value) {
        this.hasOneDriveLicense = value;
    }
    /**
     * Sets the hasSharePointLicense property value. Whether the user has been assigned a SharePoint license.
     * @param value Value to set for the hasSharePointLicense property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHasSharePointLicense(@javax.annotation.Nullable final Boolean value) {
        this.hasSharePointLicense = value;
    }
    /**
     * Sets the hasSkypeForBusinessLicense property value. Whether the user has been assigned a Skype For Business license.
     * @param value Value to set for the hasSkypeForBusinessLicense property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHasSkypeForBusinessLicense(@javax.annotation.Nullable final Boolean value) {
        this.hasSkypeForBusinessLicense = value;
    }
    /**
     * Sets the hasTeamsLicense property value. Whether the user has been assigned a Teams license.
     * @param value Value to set for the hasTeamsLicense property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHasTeamsLicense(@javax.annotation.Nullable final Boolean value) {
        this.hasTeamsLicense = value;
    }
    /**
     * Sets the hasYammerLicense property value. Whether the user has been assigned a Yammer license.
     * @param value Value to set for the hasYammerLicense property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHasYammerLicense(@javax.annotation.Nullable final Boolean value) {
        this.hasYammerLicense = value;
    }
    /**
     * Sets the isDeleted property value. Whether this user has been deleted or soft deleted.
     * @param value Value to set for the isDeleted property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsDeleted(@javax.annotation.Nullable final Boolean value) {
        this.isDeleted = value;
    }
    /**
     * Sets the oneDriveLastActivityDate property value. The date when user last viewed or edited files, shared files internally or externally, or synced files.
     * @param value Value to set for the oneDriveLastActivityDate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOneDriveLastActivityDate(@javax.annotation.Nullable final LocalDate value) {
        this.oneDriveLastActivityDate = value;
    }
    /**
     * Sets the oneDriveLicenseAssignDate property value. The last date when the user was assigned a OneDrive license.
     * @param value Value to set for the oneDriveLicenseAssignDate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOneDriveLicenseAssignDate(@javax.annotation.Nullable final LocalDate value) {
        this.oneDriveLicenseAssignDate = value;
    }
    /**
     * Sets the reportRefreshDate property value. The latest date of the content.
     * @param value Value to set for the reportRefreshDate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReportRefreshDate(@javax.annotation.Nullable final LocalDate value) {
        this.reportRefreshDate = value;
    }
    /**
     * Sets the sharePointLastActivityDate property value. The date when user last viewed or edited files, shared files internally or externally, synced files, or viewed SharePoint pages.
     * @param value Value to set for the sharePointLastActivityDate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSharePointLastActivityDate(@javax.annotation.Nullable final LocalDate value) {
        this.sharePointLastActivityDate = value;
    }
    /**
     * Sets the sharePointLicenseAssignDate property value. The last date when the user was assigned a SharePoint license.
     * @param value Value to set for the sharePointLicenseAssignDate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSharePointLicenseAssignDate(@javax.annotation.Nullable final LocalDate value) {
        this.sharePointLicenseAssignDate = value;
    }
    /**
     * Sets the skypeForBusinessLastActivityDate property value. The date when user last organized or participated in conferences, or joined peer-to-peer sessions.
     * @param value Value to set for the skypeForBusinessLastActivityDate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSkypeForBusinessLastActivityDate(@javax.annotation.Nullable final LocalDate value) {
        this.skypeForBusinessLastActivityDate = value;
    }
    /**
     * Sets the skypeForBusinessLicenseAssignDate property value. The last date when the user was assigned a Skype For Business license.
     * @param value Value to set for the skypeForBusinessLicenseAssignDate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSkypeForBusinessLicenseAssignDate(@javax.annotation.Nullable final LocalDate value) {
        this.skypeForBusinessLicenseAssignDate = value;
    }
    /**
     * Sets the teamsLastActivityDate property value. The date when user last posted messages in team channels, sent messages in private chat sessions, or participated in meetings or calls.
     * @param value Value to set for the teamsLastActivityDate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTeamsLastActivityDate(@javax.annotation.Nullable final LocalDate value) {
        this.teamsLastActivityDate = value;
    }
    /**
     * Sets the teamsLicenseAssignDate property value. The last date when the user was assigned a Teams license.
     * @param value Value to set for the teamsLicenseAssignDate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTeamsLicenseAssignDate(@javax.annotation.Nullable final LocalDate value) {
        this.teamsLicenseAssignDate = value;
    }
    /**
     * Sets the userPrincipalName property value. The user principal name (UPN) of the user. The UPN is an Internet-style login name for the user based on the Internet standard RFC 822. By convention, this should map to the user's email name. The general format is alias@domain, where domain must be present in the tenants collection of verified domains. This property is required when a user is created.
     * @param value Value to set for the userPrincipalName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserPrincipalName(@javax.annotation.Nullable final String value) {
        this.userPrincipalName = value;
    }
    /**
     * Sets the yammerLastActivityDate property value. The date when user last posted, read, or liked message.
     * @param value Value to set for the yammerLastActivityDate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setYammerLastActivityDate(@javax.annotation.Nullable final LocalDate value) {
        this.yammerLastActivityDate = value;
    }
    /**
     * Sets the yammerLicenseAssignDate property value. The last date when the user was assigned a Yammer license.
     * @param value Value to set for the yammerLicenseAssignDate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setYammerLicenseAssignDate(@javax.annotation.Nullable final LocalDate value) {
        this.yammerLicenseAssignDate = value;
    }
}
