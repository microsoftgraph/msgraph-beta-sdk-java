package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WindowsPhone81AppX extends MobileLobApp implements Parsable {
    /** Contains properties for Windows architecture. */
    private WindowsArchitecture applicableArchitectures;
    /** The Identity Name. */
    private String identityName;
    /** The Identity Publisher Hash. */
    private String identityPublisherHash;
    /** The Identity Resource Identifier. */
    private String identityResourceIdentifier;
    /** The identity version. */
    private String identityVersion;
    /** The minimum operating system required for a Windows mobile app. */
    private WindowsMinimumOperatingSystem minimumSupportedOperatingSystem;
    /** The Phone Product Identifier. */
    private String phoneProductIdentifier;
    /** The Phone Publisher Id. */
    private String phonePublisherId;
    /**
     * Instantiates a new WindowsPhone81AppX and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public WindowsPhone81AppX() {
        super();
        this.setOdataType("#microsoft.graph.windowsPhone81AppX");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WindowsPhone81AppX
     */
    @javax.annotation.Nonnull
    public static WindowsPhone81AppX createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.windowsPhone81AppXBundle": return new WindowsPhone81AppXBundle();
            }
        }
        return new WindowsPhone81AppX();
    }
    /**
     * Gets the applicableArchitectures property value. Contains properties for Windows architecture.
     * @return a WindowsArchitecture
     */
    @javax.annotation.Nullable
    public WindowsArchitecture getApplicableArchitectures() {
        return this.applicableArchitectures;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("applicableArchitectures", (n) -> { this.setApplicableArchitectures(n.getEnumValue(WindowsArchitecture.class)); });
        deserializerMap.put("identityName", (n) -> { this.setIdentityName(n.getStringValue()); });
        deserializerMap.put("identityPublisherHash", (n) -> { this.setIdentityPublisherHash(n.getStringValue()); });
        deserializerMap.put("identityResourceIdentifier", (n) -> { this.setIdentityResourceIdentifier(n.getStringValue()); });
        deserializerMap.put("identityVersion", (n) -> { this.setIdentityVersion(n.getStringValue()); });
        deserializerMap.put("minimumSupportedOperatingSystem", (n) -> { this.setMinimumSupportedOperatingSystem(n.getObjectValue(WindowsMinimumOperatingSystem::createFromDiscriminatorValue)); });
        deserializerMap.put("phoneProductIdentifier", (n) -> { this.setPhoneProductIdentifier(n.getStringValue()); });
        deserializerMap.put("phonePublisherId", (n) -> { this.setPhonePublisherId(n.getStringValue()); });
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
     * Gets the identityPublisherHash property value. The Identity Publisher Hash.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getIdentityPublisherHash() {
        return this.identityPublisherHash;
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
     * Gets the identityVersion property value. The identity version.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getIdentityVersion() {
        return this.identityVersion;
    }
    /**
     * Gets the minimumSupportedOperatingSystem property value. The minimum operating system required for a Windows mobile app.
     * @return a WindowsMinimumOperatingSystem
     */
    @javax.annotation.Nullable
    public WindowsMinimumOperatingSystem getMinimumSupportedOperatingSystem() {
        return this.minimumSupportedOperatingSystem;
    }
    /**
     * Gets the phoneProductIdentifier property value. The Phone Product Identifier.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPhoneProductIdentifier() {
        return this.phoneProductIdentifier;
    }
    /**
     * Gets the phonePublisherId property value. The Phone Publisher Id.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPhonePublisherId() {
        return this.phonePublisherId;
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
        writer.writeEnumValue("applicableArchitectures", this.getApplicableArchitectures());
        writer.writeStringValue("identityName", this.getIdentityName());
        writer.writeStringValue("identityPublisherHash", this.getIdentityPublisherHash());
        writer.writeStringValue("identityResourceIdentifier", this.getIdentityResourceIdentifier());
        writer.writeStringValue("identityVersion", this.getIdentityVersion());
        writer.writeObjectValue("minimumSupportedOperatingSystem", this.getMinimumSupportedOperatingSystem());
        writer.writeStringValue("phoneProductIdentifier", this.getPhoneProductIdentifier());
        writer.writeStringValue("phonePublisherId", this.getPhonePublisherId());
    }
    /**
     * Sets the applicableArchitectures property value. Contains properties for Windows architecture.
     * @param value Value to set for the applicableArchitectures property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setApplicableArchitectures(@javax.annotation.Nullable final WindowsArchitecture value) {
        this.applicableArchitectures = value;
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
     * Sets the identityPublisherHash property value. The Identity Publisher Hash.
     * @param value Value to set for the identityPublisherHash property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIdentityPublisherHash(@javax.annotation.Nullable final String value) {
        this.identityPublisherHash = value;
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
     * Sets the identityVersion property value. The identity version.
     * @param value Value to set for the identityVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIdentityVersion(@javax.annotation.Nullable final String value) {
        this.identityVersion = value;
    }
    /**
     * Sets the minimumSupportedOperatingSystem property value. The minimum operating system required for a Windows mobile app.
     * @param value Value to set for the minimumSupportedOperatingSystem property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMinimumSupportedOperatingSystem(@javax.annotation.Nullable final WindowsMinimumOperatingSystem value) {
        this.minimumSupportedOperatingSystem = value;
    }
    /**
     * Sets the phoneProductIdentifier property value. The Phone Product Identifier.
     * @param value Value to set for the phoneProductIdentifier property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPhoneProductIdentifier(@javax.annotation.Nullable final String value) {
        this.phoneProductIdentifier = value;
    }
    /**
     * Sets the phonePublisherId property value. The Phone Publisher Id.
     * @param value Value to set for the phonePublisherId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPhonePublisherId(@javax.annotation.Nullable final String value) {
        this.phonePublisherId = value;
    }
}
