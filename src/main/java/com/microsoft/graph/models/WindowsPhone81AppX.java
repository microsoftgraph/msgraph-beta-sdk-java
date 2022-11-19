package com.microsoft.graph.models;

import com.microsoft.graph.models.WindowsPhone81AppXBundle;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WindowsPhone81AppX extends MobileLobApp implements Parsable {
    /** Contains properties for Windows architecture. */
    private WindowsArchitecture _applicableArchitectures;
    /** The Identity Name. */
    private String _identityName;
    /** The Identity Publisher Hash. */
    private String _identityPublisherHash;
    /** The Identity Resource Identifier. */
    private String _identityResourceIdentifier;
    /** The identity version. */
    private String _identityVersion;
    /** The minimum operating system required for a Windows mobile app. */
    private WindowsMinimumOperatingSystem _minimumSupportedOperatingSystem;
    /** The Phone Product Identifier. */
    private String _phoneProductIdentifier;
    /** The Phone Publisher Id. */
    private String _phonePublisherId;
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
     * @return a windowsArchitecture
     */
    @javax.annotation.Nullable
    public WindowsArchitecture getApplicableArchitectures() {
        return this._applicableArchitectures;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WindowsPhone81AppX currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("applicableArchitectures", (n) -> { currentObject.setApplicableArchitectures(n.getEnumValue(WindowsArchitecture.class)); });
        deserializerMap.put("identityName", (n) -> { currentObject.setIdentityName(n.getStringValue()); });
        deserializerMap.put("identityPublisherHash", (n) -> { currentObject.setIdentityPublisherHash(n.getStringValue()); });
        deserializerMap.put("identityResourceIdentifier", (n) -> { currentObject.setIdentityResourceIdentifier(n.getStringValue()); });
        deserializerMap.put("identityVersion", (n) -> { currentObject.setIdentityVersion(n.getStringValue()); });
        deserializerMap.put("minimumSupportedOperatingSystem", (n) -> { currentObject.setMinimumSupportedOperatingSystem(n.getObjectValue(WindowsMinimumOperatingSystem::createFromDiscriminatorValue)); });
        deserializerMap.put("phoneProductIdentifier", (n) -> { currentObject.setPhoneProductIdentifier(n.getStringValue()); });
        deserializerMap.put("phonePublisherId", (n) -> { currentObject.setPhonePublisherId(n.getStringValue()); });
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
     * Gets the identityPublisherHash property value. The Identity Publisher Hash.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getIdentityPublisherHash() {
        return this._identityPublisherHash;
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
     * Gets the identityVersion property value. The identity version.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getIdentityVersion() {
        return this._identityVersion;
    }
    /**
     * Gets the minimumSupportedOperatingSystem property value. The minimum operating system required for a Windows mobile app.
     * @return a windowsMinimumOperatingSystem
     */
    @javax.annotation.Nullable
    public WindowsMinimumOperatingSystem getMinimumSupportedOperatingSystem() {
        return this._minimumSupportedOperatingSystem;
    }
    /**
     * Gets the phoneProductIdentifier property value. The Phone Product Identifier.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPhoneProductIdentifier() {
        return this._phoneProductIdentifier;
    }
    /**
     * Gets the phonePublisherId property value. The Phone Publisher Id.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPhonePublisherId() {
        return this._phonePublisherId;
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
        this._applicableArchitectures = value;
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
     * Sets the identityPublisherHash property value. The Identity Publisher Hash.
     * @param value Value to set for the identityPublisherHash property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIdentityPublisherHash(@javax.annotation.Nullable final String value) {
        this._identityPublisherHash = value;
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
     * Sets the identityVersion property value. The identity version.
     * @param value Value to set for the identityVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIdentityVersion(@javax.annotation.Nullable final String value) {
        this._identityVersion = value;
    }
    /**
     * Sets the minimumSupportedOperatingSystem property value. The minimum operating system required for a Windows mobile app.
     * @param value Value to set for the minimumSupportedOperatingSystem property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMinimumSupportedOperatingSystem(@javax.annotation.Nullable final WindowsMinimumOperatingSystem value) {
        this._minimumSupportedOperatingSystem = value;
    }
    /**
     * Sets the phoneProductIdentifier property value. The Phone Product Identifier.
     * @param value Value to set for the phoneProductIdentifier property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPhoneProductIdentifier(@javax.annotation.Nullable final String value) {
        this._phoneProductIdentifier = value;
    }
    /**
     * Sets the phonePublisherId property value. The Phone Publisher Id.
     * @param value Value to set for the phonePublisherId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPhonePublisherId(@javax.annotation.Nullable final String value) {
        this._phonePublisherId = value;
    }
}
