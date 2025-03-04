package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Office365ActiveUserDetail extends Entity implements Parsable {
    /**
     * Instantiates a new {@link Office365ActiveUserDetail} and sets the default values.
     */
    public Office365ActiveUserDetail() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Office365ActiveUserDetail}
     */
    @jakarta.annotation.Nonnull
    public static Office365ActiveUserDetail createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Office365ActiveUserDetail();
    }
    /**
     * Gets the assignedProducts property value. All the products assigned for the user.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAssignedProducts() {
        return this.backingStore.get("assignedProducts");
    }
    /**
     * Gets the deletedDate property value. The date when the delete operation happened. Default value is &apos;null&apos; when the user hasn&apos;t been deleted.
     * @return a {@link LocalDate}
     */
    @jakarta.annotation.Nullable
    public LocalDate getDeletedDate() {
        return this.backingStore.get("deletedDate");
    }
    /**
     * Gets the displayName property value. The name displayed in the address book for the user. This is usually the combination of the user&apos;s first name, middle initial, and last name. This property is required when a user is created and it can&apos;t be cleared during updates.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * Gets the exchangeLastActivityDate property value. The date when user last read or sent email.
     * @return a {@link LocalDate}
     */
    @jakarta.annotation.Nullable
    public LocalDate getExchangeLastActivityDate() {
        return this.backingStore.get("exchangeLastActivityDate");
    }
    /**
     * Gets the exchangeLicenseAssignDate property value. The last date when the user was assigned an Exchange license.
     * @return a {@link LocalDate}
     */
    @jakarta.annotation.Nullable
    public LocalDate getExchangeLicenseAssignDate() {
        return this.backingStore.get("exchangeLicenseAssignDate");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
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
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getHasExchangeLicense() {
        return this.backingStore.get("hasExchangeLicense");
    }
    /**
     * Gets the hasOneDriveLicense property value. Whether the user has been assigned a OneDrive license.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getHasOneDriveLicense() {
        return this.backingStore.get("hasOneDriveLicense");
    }
    /**
     * Gets the hasSharePointLicense property value. Whether the user has been assigned a SharePoint license.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getHasSharePointLicense() {
        return this.backingStore.get("hasSharePointLicense");
    }
    /**
     * Gets the hasSkypeForBusinessLicense property value. Whether the user has been assigned a Skype For Business license.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getHasSkypeForBusinessLicense() {
        return this.backingStore.get("hasSkypeForBusinessLicense");
    }
    /**
     * Gets the hasTeamsLicense property value. Whether the user has been assigned a Teams license.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getHasTeamsLicense() {
        return this.backingStore.get("hasTeamsLicense");
    }
    /**
     * Gets the hasYammerLicense property value. Whether the user has been assigned a Yammer license.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getHasYammerLicense() {
        return this.backingStore.get("hasYammerLicense");
    }
    /**
     * Gets the isDeleted property value. Whether this user has been deleted or soft deleted.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsDeleted() {
        return this.backingStore.get("isDeleted");
    }
    /**
     * Gets the oneDriveLastActivityDate property value. The date when user last viewed or edited files, shared files internally or externally, or synced files.
     * @return a {@link LocalDate}
     */
    @jakarta.annotation.Nullable
    public LocalDate getOneDriveLastActivityDate() {
        return this.backingStore.get("oneDriveLastActivityDate");
    }
    /**
     * Gets the oneDriveLicenseAssignDate property value. The last date when the user was assigned a OneDrive license.
     * @return a {@link LocalDate}
     */
    @jakarta.annotation.Nullable
    public LocalDate getOneDriveLicenseAssignDate() {
        return this.backingStore.get("oneDriveLicenseAssignDate");
    }
    /**
     * Gets the reportRefreshDate property value. The latest date of the content.
     * @return a {@link LocalDate}
     */
    @jakarta.annotation.Nullable
    public LocalDate getReportRefreshDate() {
        return this.backingStore.get("reportRefreshDate");
    }
    /**
     * Gets the sharePointLastActivityDate property value. The date when user last viewed or edited files, shared files internally or externally, synced files, or viewed SharePoint pages.
     * @return a {@link LocalDate}
     */
    @jakarta.annotation.Nullable
    public LocalDate getSharePointLastActivityDate() {
        return this.backingStore.get("sharePointLastActivityDate");
    }
    /**
     * Gets the sharePointLicenseAssignDate property value. The last date when the user was assigned a SharePoint license.
     * @return a {@link LocalDate}
     */
    @jakarta.annotation.Nullable
    public LocalDate getSharePointLicenseAssignDate() {
        return this.backingStore.get("sharePointLicenseAssignDate");
    }
    /**
     * Gets the skypeForBusinessLastActivityDate property value. The date when user last organized or participated in conferences, or joined peer-to-peer sessions.
     * @return a {@link LocalDate}
     */
    @jakarta.annotation.Nullable
    public LocalDate getSkypeForBusinessLastActivityDate() {
        return this.backingStore.get("skypeForBusinessLastActivityDate");
    }
    /**
     * Gets the skypeForBusinessLicenseAssignDate property value. The last date when the user was assigned a Skype For Business license.
     * @return a {@link LocalDate}
     */
    @jakarta.annotation.Nullable
    public LocalDate getSkypeForBusinessLicenseAssignDate() {
        return this.backingStore.get("skypeForBusinessLicenseAssignDate");
    }
    /**
     * Gets the teamsLastActivityDate property value. The date when user last posted messages in team channels, sent messages in private chat sessions, or participated in meetings or calls.
     * @return a {@link LocalDate}
     */
    @jakarta.annotation.Nullable
    public LocalDate getTeamsLastActivityDate() {
        return this.backingStore.get("teamsLastActivityDate");
    }
    /**
     * Gets the teamsLicenseAssignDate property value. The last date when the user was assigned a Teams license.
     * @return a {@link LocalDate}
     */
    @jakarta.annotation.Nullable
    public LocalDate getTeamsLicenseAssignDate() {
        return this.backingStore.get("teamsLicenseAssignDate");
    }
    /**
     * Gets the userPrincipalName property value. The user principal name (UPN) of the user. The UPN is an Internet-style login name for the user based on the Internet standard RFC 822. By convention, this should map to the user&apos;s email name. The general format is alias@domain, where domain must be present in the tenants collection of verified domains. This property is required when a user is created.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUserPrincipalName() {
        return this.backingStore.get("userPrincipalName");
    }
    /**
     * Gets the yammerLastActivityDate property value. The date when user last posted, read, or liked message.
     * @return a {@link LocalDate}
     */
    @jakarta.annotation.Nullable
    public LocalDate getYammerLastActivityDate() {
        return this.backingStore.get("yammerLastActivityDate");
    }
    /**
     * Gets the yammerLicenseAssignDate property value. The last date when the user was assigned a Yammer license.
     * @return a {@link LocalDate}
     */
    @jakarta.annotation.Nullable
    public LocalDate getYammerLicenseAssignDate() {
        return this.backingStore.get("yammerLicenseAssignDate");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setAssignedProducts(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("assignedProducts", value);
    }
    /**
     * Sets the deletedDate property value. The date when the delete operation happened. Default value is &apos;null&apos; when the user hasn&apos;t been deleted.
     * @param value Value to set for the deletedDate property.
     */
    public void setDeletedDate(@jakarta.annotation.Nullable final LocalDate value) {
        this.backingStore.set("deletedDate", value);
    }
    /**
     * Sets the displayName property value. The name displayed in the address book for the user. This is usually the combination of the user&apos;s first name, middle initial, and last name. This property is required when a user is created and it can&apos;t be cleared during updates.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the exchangeLastActivityDate property value. The date when user last read or sent email.
     * @param value Value to set for the exchangeLastActivityDate property.
     */
    public void setExchangeLastActivityDate(@jakarta.annotation.Nullable final LocalDate value) {
        this.backingStore.set("exchangeLastActivityDate", value);
    }
    /**
     * Sets the exchangeLicenseAssignDate property value. The last date when the user was assigned an Exchange license.
     * @param value Value to set for the exchangeLicenseAssignDate property.
     */
    public void setExchangeLicenseAssignDate(@jakarta.annotation.Nullable final LocalDate value) {
        this.backingStore.set("exchangeLicenseAssignDate", value);
    }
    /**
     * Sets the hasExchangeLicense property value. Whether the user has been assigned an Exchange license.
     * @param value Value to set for the hasExchangeLicense property.
     */
    public void setHasExchangeLicense(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("hasExchangeLicense", value);
    }
    /**
     * Sets the hasOneDriveLicense property value. Whether the user has been assigned a OneDrive license.
     * @param value Value to set for the hasOneDriveLicense property.
     */
    public void setHasOneDriveLicense(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("hasOneDriveLicense", value);
    }
    /**
     * Sets the hasSharePointLicense property value. Whether the user has been assigned a SharePoint license.
     * @param value Value to set for the hasSharePointLicense property.
     */
    public void setHasSharePointLicense(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("hasSharePointLicense", value);
    }
    /**
     * Sets the hasSkypeForBusinessLicense property value. Whether the user has been assigned a Skype For Business license.
     * @param value Value to set for the hasSkypeForBusinessLicense property.
     */
    public void setHasSkypeForBusinessLicense(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("hasSkypeForBusinessLicense", value);
    }
    /**
     * Sets the hasTeamsLicense property value. Whether the user has been assigned a Teams license.
     * @param value Value to set for the hasTeamsLicense property.
     */
    public void setHasTeamsLicense(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("hasTeamsLicense", value);
    }
    /**
     * Sets the hasYammerLicense property value. Whether the user has been assigned a Yammer license.
     * @param value Value to set for the hasYammerLicense property.
     */
    public void setHasYammerLicense(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("hasYammerLicense", value);
    }
    /**
     * Sets the isDeleted property value. Whether this user has been deleted or soft deleted.
     * @param value Value to set for the isDeleted property.
     */
    public void setIsDeleted(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isDeleted", value);
    }
    /**
     * Sets the oneDriveLastActivityDate property value. The date when user last viewed or edited files, shared files internally or externally, or synced files.
     * @param value Value to set for the oneDriveLastActivityDate property.
     */
    public void setOneDriveLastActivityDate(@jakarta.annotation.Nullable final LocalDate value) {
        this.backingStore.set("oneDriveLastActivityDate", value);
    }
    /**
     * Sets the oneDriveLicenseAssignDate property value. The last date when the user was assigned a OneDrive license.
     * @param value Value to set for the oneDriveLicenseAssignDate property.
     */
    public void setOneDriveLicenseAssignDate(@jakarta.annotation.Nullable final LocalDate value) {
        this.backingStore.set("oneDriveLicenseAssignDate", value);
    }
    /**
     * Sets the reportRefreshDate property value. The latest date of the content.
     * @param value Value to set for the reportRefreshDate property.
     */
    public void setReportRefreshDate(@jakarta.annotation.Nullable final LocalDate value) {
        this.backingStore.set("reportRefreshDate", value);
    }
    /**
     * Sets the sharePointLastActivityDate property value. The date when user last viewed or edited files, shared files internally or externally, synced files, or viewed SharePoint pages.
     * @param value Value to set for the sharePointLastActivityDate property.
     */
    public void setSharePointLastActivityDate(@jakarta.annotation.Nullable final LocalDate value) {
        this.backingStore.set("sharePointLastActivityDate", value);
    }
    /**
     * Sets the sharePointLicenseAssignDate property value. The last date when the user was assigned a SharePoint license.
     * @param value Value to set for the sharePointLicenseAssignDate property.
     */
    public void setSharePointLicenseAssignDate(@jakarta.annotation.Nullable final LocalDate value) {
        this.backingStore.set("sharePointLicenseAssignDate", value);
    }
    /**
     * Sets the skypeForBusinessLastActivityDate property value. The date when user last organized or participated in conferences, or joined peer-to-peer sessions.
     * @param value Value to set for the skypeForBusinessLastActivityDate property.
     */
    public void setSkypeForBusinessLastActivityDate(@jakarta.annotation.Nullable final LocalDate value) {
        this.backingStore.set("skypeForBusinessLastActivityDate", value);
    }
    /**
     * Sets the skypeForBusinessLicenseAssignDate property value. The last date when the user was assigned a Skype For Business license.
     * @param value Value to set for the skypeForBusinessLicenseAssignDate property.
     */
    public void setSkypeForBusinessLicenseAssignDate(@jakarta.annotation.Nullable final LocalDate value) {
        this.backingStore.set("skypeForBusinessLicenseAssignDate", value);
    }
    /**
     * Sets the teamsLastActivityDate property value. The date when user last posted messages in team channels, sent messages in private chat sessions, or participated in meetings or calls.
     * @param value Value to set for the teamsLastActivityDate property.
     */
    public void setTeamsLastActivityDate(@jakarta.annotation.Nullable final LocalDate value) {
        this.backingStore.set("teamsLastActivityDate", value);
    }
    /**
     * Sets the teamsLicenseAssignDate property value. The last date when the user was assigned a Teams license.
     * @param value Value to set for the teamsLicenseAssignDate property.
     */
    public void setTeamsLicenseAssignDate(@jakarta.annotation.Nullable final LocalDate value) {
        this.backingStore.set("teamsLicenseAssignDate", value);
    }
    /**
     * Sets the userPrincipalName property value. The user principal name (UPN) of the user. The UPN is an Internet-style login name for the user based on the Internet standard RFC 822. By convention, this should map to the user&apos;s email name. The general format is alias@domain, where domain must be present in the tenants collection of verified domains. This property is required when a user is created.
     * @param value Value to set for the userPrincipalName property.
     */
    public void setUserPrincipalName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userPrincipalName", value);
    }
    /**
     * Sets the yammerLastActivityDate property value. The date when user last posted, read, or liked message.
     * @param value Value to set for the yammerLastActivityDate property.
     */
    public void setYammerLastActivityDate(@jakarta.annotation.Nullable final LocalDate value) {
        this.backingStore.set("yammerLastActivityDate", value);
    }
    /**
     * Sets the yammerLicenseAssignDate property value. The last date when the user was assigned a Yammer license.
     * @param value Value to set for the yammerLicenseAssignDate property.
     */
    public void setYammerLicenseAssignDate(@jakarta.annotation.Nullable final LocalDate value) {
        this.backingStore.set("yammerLicenseAssignDate", value);
    }
}
