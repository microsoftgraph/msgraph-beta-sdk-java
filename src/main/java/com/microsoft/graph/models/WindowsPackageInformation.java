package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Contains properties for the package information for a Windows line of business app. Used as property within windowsPhone81AppXBundle object, which is also being deprecated. This complex type will be deprecated in February 2023.
 */
public class WindowsPackageInformation implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Contains properties for Windows architecture.
     */
    private WindowsArchitecture applicableArchitecture;
    /**
     * The Display Name.
     */
    private String displayName;
    /**
     * The Identity Name.
     */
    private String identityName;
    /**
     * The Identity Publisher.
     */
    private String identityPublisher;
    /**
     * The Identity Resource Identifier.
     */
    private String identityResourceIdentifier;
    /**
     * The Identity Version.
     */
    private String identityVersion;
    /**
     * The value for the minimum applicable operating system.
     */
    private WindowsMinimumOperatingSystem minimumSupportedOperatingSystem;
    /**
     * The OdataType property
     */
    private String odataType;
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
        return this.additionalData;
    }
    /**
     * Gets the applicableArchitecture property value. Contains properties for Windows architecture.
     * @return a windowsArchitecture
     */
    @javax.annotation.Nullable
    public WindowsArchitecture getApplicableArchitecture() {
        return this.applicableArchitecture;
    }
    /**
     * Gets the displayName property value. The Display Name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
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
        return this.identityName;
    }
    /**
     * Gets the identityPublisher property value. The Identity Publisher.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getIdentityPublisher() {
        return this.identityPublisher;
    }
    /**
     * Gets the identityResourceIdentifier property value. The Identity Resource Identifier.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getIdentityResourceIdentifier() {
        return this.identityResourceIdentifier;
    }
    /**
     * Gets the identityVersion property value. The Identity Version.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getIdentityVersion() {
        return this.identityVersion;
    }
    /**
     * Gets the minimumSupportedOperatingSystem property value. The value for the minimum applicable operating system.
     * @return a windowsMinimumOperatingSystem
     */
    @javax.annotation.Nullable
    public WindowsMinimumOperatingSystem getMinimumSupportedOperatingSystem() {
        return this.minimumSupportedOperatingSystem;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
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
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the applicableArchitecture property value. Contains properties for Windows architecture.
     * @param value Value to set for the applicableArchitecture property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setApplicableArchitecture(@javax.annotation.Nullable final WindowsArchitecture value) {
        this.applicableArchitecture = value;
    }
    /**
     * Sets the displayName property value. The Display Name.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the identityName property value. The Identity Name.
     * @param value Value to set for the identityName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIdentityName(@javax.annotation.Nullable final String value) {
        this.identityName = value;
    }
    /**
     * Sets the identityPublisher property value. The Identity Publisher.
     * @param value Value to set for the identityPublisher property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIdentityPublisher(@javax.annotation.Nullable final String value) {
        this.identityPublisher = value;
    }
    /**
     * Sets the identityResourceIdentifier property value. The Identity Resource Identifier.
     * @param value Value to set for the identityResourceIdentifier property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIdentityResourceIdentifier(@javax.annotation.Nullable final String value) {
        this.identityResourceIdentifier = value;
    }
    /**
     * Sets the identityVersion property value. The Identity Version.
     * @param value Value to set for the identityVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIdentityVersion(@javax.annotation.Nullable final String value) {
        this.identityVersion = value;
    }
    /**
     * Sets the minimumSupportedOperatingSystem property value. The value for the minimum applicable operating system.
     * @param value Value to set for the minimumSupportedOperatingSystem property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMinimumSupportedOperatingSystem(@javax.annotation.Nullable final WindowsMinimumOperatingSystem value) {
        this.minimumSupportedOperatingSystem = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
}
