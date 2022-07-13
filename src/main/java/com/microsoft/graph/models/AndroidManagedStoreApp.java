package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AndroidManagedStoreApp extends MobileApp implements Parsable {
    /** The Identity Name. */
    private String _appIdentifier;
    /** The Play for Work Store app URL. */
    private String _appStoreUrl;
    /** The tracks that are visible to this enterprise. */
    private java.util.List<AndroidManagedStoreAppTrack> _appTracks;
    /** Indicates whether the app is only available to a given enterprise's users. */
    private Boolean _isPrivate;
    /** Indicates whether the app is a preinstalled system app. */
    private Boolean _isSystemApp;
    /** The package identifier. */
    private String _packageId;
    /** Whether this app supports OEMConfig policy. */
    private Boolean _supportsOemConfig;
    /** The total number of VPP licenses. */
    private Integer _totalLicenseCount;
    /** The number of VPP licenses in use. */
    private Integer _usedLicenseCount;
    /**
     * Instantiates a new AndroidManagedStoreApp and sets the default values.
     * @return a void
     */
    public AndroidManagedStoreApp() {
        super();
        this.setOdatatype("#microsoft.graph.androidManagedStoreApp");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AndroidManagedStoreApp
     */
    @javax.annotation.Nonnull
    public static AndroidManagedStoreApp createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.androidManagedStoreWebApp": return new AndroidManagedStoreWebApp();
            }
        }
        return new AndroidManagedStoreApp();
    }
    /**
     * Gets the appIdentifier property value. The Identity Name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAppIdentifier() {
        return this._appIdentifier;
    }
    /**
     * Gets the appStoreUrl property value. The Play for Work Store app URL.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAppStoreUrl() {
        return this._appStoreUrl;
    }
    /**
     * Gets the appTracks property value. The tracks that are visible to this enterprise.
     * @return a androidManagedStoreAppTrack
     */
    @javax.annotation.Nullable
    public java.util.List<AndroidManagedStoreAppTrack> getAppTracks() {
        return this._appTracks;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AndroidManagedStoreApp currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("appIdentifier", (n) -> { currentObject.setAppIdentifier(n.getStringValue()); });
            this.put("appStoreUrl", (n) -> { currentObject.setAppStoreUrl(n.getStringValue()); });
            this.put("appTracks", (n) -> { currentObject.setAppTracks(n.getCollectionOfObjectValues(AndroidManagedStoreAppTrack::createFromDiscriminatorValue)); });
            this.put("isPrivate", (n) -> { currentObject.setIsPrivate(n.getBooleanValue()); });
            this.put("isSystemApp", (n) -> { currentObject.setIsSystemApp(n.getBooleanValue()); });
            this.put("packageId", (n) -> { currentObject.setPackageId(n.getStringValue()); });
            this.put("supportsOemConfig", (n) -> { currentObject.setSupportsOemConfig(n.getBooleanValue()); });
            this.put("totalLicenseCount", (n) -> { currentObject.setTotalLicenseCount(n.getIntegerValue()); });
            this.put("usedLicenseCount", (n) -> { currentObject.setUsedLicenseCount(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the isPrivate property value. Indicates whether the app is only available to a given enterprise's users.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsPrivate() {
        return this._isPrivate;
    }
    /**
     * Gets the isSystemApp property value. Indicates whether the app is a preinstalled system app.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsSystemApp() {
        return this._isSystemApp;
    }
    /**
     * Gets the packageId property value. The package identifier.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPackageId() {
        return this._packageId;
    }
    /**
     * Gets the supportsOemConfig property value. Whether this app supports OEMConfig policy.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSupportsOemConfig() {
        return this._supportsOemConfig;
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("appIdentifier", this.getAppIdentifier());
        writer.writeStringValue("appStoreUrl", this.getAppStoreUrl());
        writer.writeCollectionOfObjectValues("appTracks", this.getAppTracks());
        writer.writeBooleanValue("isPrivate", this.getIsPrivate());
        writer.writeBooleanValue("isSystemApp", this.getIsSystemApp());
        writer.writeStringValue("packageId", this.getPackageId());
        writer.writeBooleanValue("supportsOemConfig", this.getSupportsOemConfig());
        writer.writeIntegerValue("totalLicenseCount", this.getTotalLicenseCount());
        writer.writeIntegerValue("usedLicenseCount", this.getUsedLicenseCount());
    }
    /**
     * Sets the appIdentifier property value. The Identity Name.
     * @param value Value to set for the appIdentifier property.
     * @return a void
     */
    public void setAppIdentifier(@javax.annotation.Nullable final String value) {
        this._appIdentifier = value;
    }
    /**
     * Sets the appStoreUrl property value. The Play for Work Store app URL.
     * @param value Value to set for the appStoreUrl property.
     * @return a void
     */
    public void setAppStoreUrl(@javax.annotation.Nullable final String value) {
        this._appStoreUrl = value;
    }
    /**
     * Sets the appTracks property value. The tracks that are visible to this enterprise.
     * @param value Value to set for the appTracks property.
     * @return a void
     */
    public void setAppTracks(@javax.annotation.Nullable final java.util.List<AndroidManagedStoreAppTrack> value) {
        this._appTracks = value;
    }
    /**
     * Sets the isPrivate property value. Indicates whether the app is only available to a given enterprise's users.
     * @param value Value to set for the isPrivate property.
     * @return a void
     */
    public void setIsPrivate(@javax.annotation.Nullable final Boolean value) {
        this._isPrivate = value;
    }
    /**
     * Sets the isSystemApp property value. Indicates whether the app is a preinstalled system app.
     * @param value Value to set for the isSystemApp property.
     * @return a void
     */
    public void setIsSystemApp(@javax.annotation.Nullable final Boolean value) {
        this._isSystemApp = value;
    }
    /**
     * Sets the packageId property value. The package identifier.
     * @param value Value to set for the packageId property.
     * @return a void
     */
    public void setPackageId(@javax.annotation.Nullable final String value) {
        this._packageId = value;
    }
    /**
     * Sets the supportsOemConfig property value. Whether this app supports OEMConfig policy.
     * @param value Value to set for the supportsOemConfig property.
     * @return a void
     */
    public void setSupportsOemConfig(@javax.annotation.Nullable final Boolean value) {
        this._supportsOemConfig = value;
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
}
