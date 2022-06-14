package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MacOsVppApp extends MobileApp implements Parsable {
    /** The store URL. */
    private String _appStoreUrl;
    /** The licenses assigned to this app. */
    private java.util.List<MacOsVppAppAssignedLicense> _assignedLicenses;
    /** The Identity Name. */
    private String _bundleId;
    /** The supported License Type. */
    private VppLicensingType _licensingType;
    /** The VPP application release date and time. */
    private OffsetDateTime _releaseDateTime;
    /** Results of revoke license actions on this app. */
    private java.util.List<MacOsVppAppRevokeLicensesActionResult> _revokeLicenseActionResults;
    /** The total number of VPP licenses. */
    private Integer _totalLicenseCount;
    /** The number of VPP licenses in use. */
    private Integer _usedLicenseCount;
    /** The type of volume purchase program which the given Apple Volume Purchase Program Token is associated with. Possible values are: business, education. Possible values are: business, education. */
    private VppTokenAccountType _vppTokenAccountType;
    /** The Apple Id associated with the given Apple Volume Purchase Program Token. */
    private String _vppTokenAppleId;
    /** Identifier of the VPP token associated with this app. */
    private String _vppTokenId;
    /** The organization associated with the Apple Volume Purchase Program Token */
    private String _vppTokenOrganizationName;
    /**
     * Instantiates a new MacOsVppApp and sets the default values.
     * @return a void
     */
    public MacOsVppApp() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MacOsVppApp
     */
    @javax.annotation.Nonnull
    public static MacOsVppApp createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MacOsVppApp();
    }
    /**
     * Gets the appStoreUrl property value. The store URL.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAppStoreUrl() {
        return this._appStoreUrl;
    }
    /**
     * Gets the assignedLicenses property value. The licenses assigned to this app.
     * @return a macOsVppAppAssignedLicense
     */
    @javax.annotation.Nullable
    public java.util.List<MacOsVppAppAssignedLicense> getAssignedLicenses() {
        return this._assignedLicenses;
    }
    /**
     * Gets the bundleId property value. The Identity Name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBundleId() {
        return this._bundleId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final MacOsVppApp currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("appStoreUrl", (n) -> { currentObject.setAppStoreUrl(n.getStringValue()); });
            this.put("assignedLicenses", (n) -> { currentObject.setAssignedLicenses(n.getCollectionOfObjectValues(MacOsVppAppAssignedLicense::createFromDiscriminatorValue)); });
            this.put("bundleId", (n) -> { currentObject.setBundleId(n.getStringValue()); });
            this.put("licensingType", (n) -> { currentObject.setLicensingType(n.getObjectValue(VppLicensingType::createFromDiscriminatorValue)); });
            this.put("releaseDateTime", (n) -> { currentObject.setReleaseDateTime(n.getOffsetDateTimeValue()); });
            this.put("revokeLicenseActionResults", (n) -> { currentObject.setRevokeLicenseActionResults(n.getCollectionOfObjectValues(MacOsVppAppRevokeLicensesActionResult::createFromDiscriminatorValue)); });
            this.put("totalLicenseCount", (n) -> { currentObject.setTotalLicenseCount(n.getIntegerValue()); });
            this.put("usedLicenseCount", (n) -> { currentObject.setUsedLicenseCount(n.getIntegerValue()); });
            this.put("vppTokenAccountType", (n) -> { currentObject.setVppTokenAccountType(n.getEnumValue(VppTokenAccountType.class)); });
            this.put("vppTokenAppleId", (n) -> { currentObject.setVppTokenAppleId(n.getStringValue()); });
            this.put("vppTokenId", (n) -> { currentObject.setVppTokenId(n.getStringValue()); });
            this.put("vppTokenOrganizationName", (n) -> { currentObject.setVppTokenOrganizationName(n.getStringValue()); });
        }};
    }
    /**
     * Gets the licensingType property value. The supported License Type.
     * @return a vppLicensingType
     */
    @javax.annotation.Nullable
    public VppLicensingType getLicensingType() {
        return this._licensingType;
    }
    /**
     * Gets the releaseDateTime property value. The VPP application release date and time.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getReleaseDateTime() {
        return this._releaseDateTime;
    }
    /**
     * Gets the revokeLicenseActionResults property value. Results of revoke license actions on this app.
     * @return a macOsVppAppRevokeLicensesActionResult
     */
    @javax.annotation.Nullable
    public java.util.List<MacOsVppAppRevokeLicensesActionResult> getRevokeLicenseActionResults() {
        return this._revokeLicenseActionResults;
    }
    /**
     * Gets the totalLicenseCount property value. The total number of VPP licenses.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTotalLicenseCount() {
        return this._totalLicenseCount;
    }
    /**
     * Gets the usedLicenseCount property value. The number of VPP licenses in use.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getUsedLicenseCount() {
        return this._usedLicenseCount;
    }
    /**
     * Gets the vppTokenAccountType property value. The type of volume purchase program which the given Apple Volume Purchase Program Token is associated with. Possible values are: business, education. Possible values are: business, education.
     * @return a vppTokenAccountType
     */
    @javax.annotation.Nullable
    public VppTokenAccountType getVppTokenAccountType() {
        return this._vppTokenAccountType;
    }
    /**
     * Gets the vppTokenAppleId property value. The Apple Id associated with the given Apple Volume Purchase Program Token.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getVppTokenAppleId() {
        return this._vppTokenAppleId;
    }
    /**
     * Gets the vppTokenId property value. Identifier of the VPP token associated with this app.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getVppTokenId() {
        return this._vppTokenId;
    }
    /**
     * Gets the vppTokenOrganizationName property value. The organization associated with the Apple Volume Purchase Program Token
     * @return a string
     */
    @javax.annotation.Nullable
    public String getVppTokenOrganizationName() {
        return this._vppTokenOrganizationName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("appStoreUrl", this.getAppStoreUrl());
        writer.writeCollectionOfObjectValues("assignedLicenses", this.getAssignedLicenses());
        writer.writeStringValue("bundleId", this.getBundleId());
        writer.writeObjectValue("licensingType", this.getLicensingType());
        writer.writeOffsetDateTimeValue("releaseDateTime", this.getReleaseDateTime());
        writer.writeCollectionOfObjectValues("revokeLicenseActionResults", this.getRevokeLicenseActionResults());
        writer.writeIntegerValue("totalLicenseCount", this.getTotalLicenseCount());
        writer.writeIntegerValue("usedLicenseCount", this.getUsedLicenseCount());
        writer.writeEnumValue("vppTokenAccountType", this.getVppTokenAccountType());
        writer.writeStringValue("vppTokenAppleId", this.getVppTokenAppleId());
        writer.writeStringValue("vppTokenId", this.getVppTokenId());
        writer.writeStringValue("vppTokenOrganizationName", this.getVppTokenOrganizationName());
    }
    /**
     * Sets the appStoreUrl property value. The store URL.
     * @param value Value to set for the appStoreUrl property.
     * @return a void
     */
    public void setAppStoreUrl(@javax.annotation.Nullable final String value) {
        this._appStoreUrl = value;
    }
    /**
     * Sets the assignedLicenses property value. The licenses assigned to this app.
     * @param value Value to set for the assignedLicenses property.
     * @return a void
     */
    public void setAssignedLicenses(@javax.annotation.Nullable final java.util.List<MacOsVppAppAssignedLicense> value) {
        this._assignedLicenses = value;
    }
    /**
     * Sets the bundleId property value. The Identity Name.
     * @param value Value to set for the bundleId property.
     * @return a void
     */
    public void setBundleId(@javax.annotation.Nullable final String value) {
        this._bundleId = value;
    }
    /**
     * Sets the licensingType property value. The supported License Type.
     * @param value Value to set for the licensingType property.
     * @return a void
     */
    public void setLicensingType(@javax.annotation.Nullable final VppLicensingType value) {
        this._licensingType = value;
    }
    /**
     * Sets the releaseDateTime property value. The VPP application release date and time.
     * @param value Value to set for the releaseDateTime property.
     * @return a void
     */
    public void setReleaseDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._releaseDateTime = value;
    }
    /**
     * Sets the revokeLicenseActionResults property value. Results of revoke license actions on this app.
     * @param value Value to set for the revokeLicenseActionResults property.
     * @return a void
     */
    public void setRevokeLicenseActionResults(@javax.annotation.Nullable final java.util.List<MacOsVppAppRevokeLicensesActionResult> value) {
        this._revokeLicenseActionResults = value;
    }
    /**
     * Sets the totalLicenseCount property value. The total number of VPP licenses.
     * @param value Value to set for the totalLicenseCount property.
     * @return a void
     */
    public void setTotalLicenseCount(@javax.annotation.Nullable final Integer value) {
        this._totalLicenseCount = value;
    }
    /**
     * Sets the usedLicenseCount property value. The number of VPP licenses in use.
     * @param value Value to set for the usedLicenseCount property.
     * @return a void
     */
    public void setUsedLicenseCount(@javax.annotation.Nullable final Integer value) {
        this._usedLicenseCount = value;
    }
    /**
     * Sets the vppTokenAccountType property value. The type of volume purchase program which the given Apple Volume Purchase Program Token is associated with. Possible values are: business, education. Possible values are: business, education.
     * @param value Value to set for the vppTokenAccountType property.
     * @return a void
     */
    public void setVppTokenAccountType(@javax.annotation.Nullable final VppTokenAccountType value) {
        this._vppTokenAccountType = value;
    }
    /**
     * Sets the vppTokenAppleId property value. The Apple Id associated with the given Apple Volume Purchase Program Token.
     * @param value Value to set for the vppTokenAppleId property.
     * @return a void
     */
    public void setVppTokenAppleId(@javax.annotation.Nullable final String value) {
        this._vppTokenAppleId = value;
    }
    /**
     * Sets the vppTokenId property value. Identifier of the VPP token associated with this app.
     * @param value Value to set for the vppTokenId property.
     * @return a void
     */
    public void setVppTokenId(@javax.annotation.Nullable final String value) {
        this._vppTokenId = value;
    }
    /**
     * Sets the vppTokenOrganizationName property value. The organization associated with the Apple Volume Purchase Program Token
     * @param value Value to set for the vppTokenOrganizationName property.
     * @return a void
     */
    public void setVppTokenOrganizationName(@javax.annotation.Nullable final String value) {
        this._vppTokenOrganizationName = value;
    }
}
