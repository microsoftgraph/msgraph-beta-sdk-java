package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AndroidForWorkApp extends MobileApp implements Parsable {
    /** The Identity Name. */
    private String _appIdentifier;
    /** The Play for Work Store app URL. */
    private String _appStoreUrl;
    /** The package identifier. */
    private String _packageId;
    /** The total number of VPP licenses. */
    private Integer _totalLicenseCount;
    /** The number of VPP licenses in use. */
    private Integer _usedLicenseCount;
    /**
     * Instantiates a new AndroidForWorkApp and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AndroidForWorkApp() {
        super();
        this.setOdataType("#microsoft.graph.androidForWorkApp");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AndroidForWorkApp
     */
    @javax.annotation.Nonnull
    public static AndroidForWorkApp createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AndroidForWorkApp();
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
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AndroidForWorkApp currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("appIdentifier", (n) -> { currentObject.setAppIdentifier(n.getStringValue()); });
        deserializerMap.put("appStoreUrl", (n) -> { currentObject.setAppStoreUrl(n.getStringValue()); });
        deserializerMap.put("packageId", (n) -> { currentObject.setPackageId(n.getStringValue()); });
        deserializerMap.put("totalLicenseCount", (n) -> { currentObject.setTotalLicenseCount(n.getIntegerValue()); });
        deserializerMap.put("usedLicenseCount", (n) -> { currentObject.setUsedLicenseCount(n.getIntegerValue()); });
        return deserializerMap
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
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("appIdentifier", this.getAppIdentifier());
        writer.writeStringValue("appStoreUrl", this.getAppStoreUrl());
        writer.writeStringValue("packageId", this.getPackageId());
        writer.writeIntegerValue("totalLicenseCount", this.getTotalLicenseCount());
        writer.writeIntegerValue("usedLicenseCount", this.getUsedLicenseCount());
    }
    /**
     * Sets the appIdentifier property value. The Identity Name.
     * @param value Value to set for the appIdentifier property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppIdentifier(@javax.annotation.Nullable final String value) {
        this._appIdentifier = value;
    }
    /**
     * Sets the appStoreUrl property value. The Play for Work Store app URL.
     * @param value Value to set for the appStoreUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppStoreUrl(@javax.annotation.Nullable final String value) {
        this._appStoreUrl = value;
    }
    /**
     * Sets the packageId property value. The package identifier.
     * @param value Value to set for the packageId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPackageId(@javax.annotation.Nullable final String value) {
        this._packageId = value;
    }
    /**
     * Sets the totalLicenseCount property value. The total number of VPP licenses.
     * @param value Value to set for the totalLicenseCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTotalLicenseCount(@javax.annotation.Nullable final Integer value) {
        this._totalLicenseCount = value;
    }
    /**
     * Sets the usedLicenseCount property value. The number of VPP licenses in use.
     * @param value Value to set for the usedLicenseCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUsedLicenseCount(@javax.annotation.Nullable final Integer value) {
        this._usedLicenseCount = value;
    }
}
