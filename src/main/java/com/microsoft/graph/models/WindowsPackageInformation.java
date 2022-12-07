package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Contains properties for the package information for a Windows line of business app. */
public class WindowsPackageInformation implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Contains properties for Windows architecture. */
    private WindowsArchitecture _applicableArchitecture;
    /** The Display Name. */
    private String _displayName;
    /** The Identity Name. */
    private String _identityName;
    /** The Identity Publisher. */
    private String _identityPublisher;
    /** The Identity Resource Identifier. */
    private String _identityResourceIdentifier;
    /** The Identity Version. */
    private String _identityVersion;
    /** The value for the minimum applicable operating system. */
    private WindowsMinimumOperatingSystem _minimumSupportedOperatingSystem;
    /** The OdataType property */
    private String _odataType;
    /**
     * Instantiates a new windowsPackageInformation and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public WindowsPackageInformation() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a windowsPackageInformation
     */
    @javax.annotation.Nonnull
    public static WindowsPackageInformation createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsPackageInformation();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the applicableArchitecture property value. Contains properties for Windows architecture.
     * @return a windowsArchitecture
     */
    @javax.annotation.Nullable
    public WindowsArchitecture getApplicableArchitecture() {
        return this._applicableArchitecture;
    }
    /**
     * Gets the displayName property value. The Display Name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(8);
        deserializerMap.put("applicableArchitecture", (n) -> { this.setApplicableArchitecture(n.getEnumValue(WindowsArchitecture.class)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("identityName", (n) -> { this.setIdentityName(n.getStringValue()); });
        deserializerMap.put("identityPublisher", (n) -> { this.setIdentityPublisher(n.getStringValue()); });
        deserializerMap.put("identityResourceIdentifier", (n) -> { this.setIdentityResourceIdentifier(n.getStringValue()); });
        deserializerMap.put("identityVersion", (n) -> { this.setIdentityVersion(n.getStringValue()); });
        deserializerMap.put("minimumSupportedOperatingSystem", (n) -> { this.setMinimumSupportedOperatingSystem(n.getObjectValue(WindowsMinimumOperatingSystem::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the identityName property value. The Identity Name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getIdentityName() {
        return this._identityName;
    }
    /**
     * Gets the identityPublisher property value. The Identity Publisher.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getIdentityPublisher() {
        return this._identityPublisher;
    }
    /**
     * Gets the identityResourceIdentifier property value. The Identity Resource Identifier.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getIdentityResourceIdentifier() {
        return this._identityResourceIdentifier;
    }
    /**
     * Gets the identityVersion property value. The Identity Version.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getIdentityVersion() {
        return this._identityVersion;
    }
    /**
     * Gets the minimumSupportedOperatingSystem property value. The value for the minimum applicable operating system.
     * @return a windowsMinimumOperatingSystem
     */
    @javax.annotation.Nullable
    public WindowsMinimumOperatingSystem getMinimumSupportedOperatingSystem() {
        return this._minimumSupportedOperatingSystem;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("applicableArchitecture", this.getApplicableArchitecture());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("identityName", this.getIdentityName());
        writer.writeStringValue("identityPublisher", this.getIdentityPublisher());
        writer.writeStringValue("identityResourceIdentifier", this.getIdentityResourceIdentifier());
        writer.writeStringValue("identityVersion", this.getIdentityVersion());
        writer.writeObjectValue("minimumSupportedOperatingSystem", this.getMinimumSupportedOperatingSystem());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the applicableArchitecture property value. Contains properties for Windows architecture.
     * @param value Value to set for the applicableArchitecture property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setApplicableArchitecture(@javax.annotation.Nullable final WindowsArchitecture value) {
        this._applicableArchitecture = value;
    }
    /**
     * Sets the displayName property value. The Display Name.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the identityName property value. The Identity Name.
     * @param value Value to set for the identityName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIdentityName(@javax.annotation.Nullable final String value) {
        this._identityName = value;
    }
    /**
     * Sets the identityPublisher property value. The Identity Publisher.
     * @param value Value to set for the identityPublisher property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIdentityPublisher(@javax.annotation.Nullable final String value) {
        this._identityPublisher = value;
    }
    /**
     * Sets the identityResourceIdentifier property value. The Identity Resource Identifier.
     * @param value Value to set for the identityResourceIdentifier property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIdentityResourceIdentifier(@javax.annotation.Nullable final String value) {
        this._identityResourceIdentifier = value;
    }
    /**
     * Sets the identityVersion property value. The Identity Version.
     * @param value Value to set for the identityVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIdentityVersion(@javax.annotation.Nullable final String value) {
        this._identityVersion = value;
    }
    /**
     * Sets the minimumSupportedOperatingSystem property value. The value for the minimum applicable operating system.
     * @param value Value to set for the minimumSupportedOperatingSystem property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMinimumSupportedOperatingSystem(@javax.annotation.Nullable final WindowsMinimumOperatingSystem value) {
        this._minimumSupportedOperatingSystem = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
}
