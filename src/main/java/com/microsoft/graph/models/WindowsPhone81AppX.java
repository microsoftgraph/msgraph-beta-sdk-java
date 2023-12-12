package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Contains properties and inherited properties for Windows Phone 8.1 AppX Line Of Business apps. Inherits from graph.mobileLobApp. Will be deprecated in February 2023.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WindowsPhone81AppX extends MobileLobApp implements Parsable {
    /**
     * Instantiates a new WindowsPhone81AppX and sets the default values.
     */
    public WindowsPhone81AppX() {
        super();
        this.setOdataType("#microsoft.graph.windowsPhone81AppX");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WindowsPhone81AppX
     */
    @jakarta.annotation.Nonnull
    public static WindowsPhone81AppX createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
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
     * @return a EnumSet<WindowsArchitecture>
     */
    @jakarta.annotation.Nullable
    public EnumSet<WindowsArchitecture> getApplicableArchitectures() {
        return this.backingStore.get("applicableArchitectures");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("applicableArchitectures", (n) -> { this.setApplicableArchitectures(n.getEnumSetValue(WindowsArchitecture::forValue)); });
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
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getIdentityName() {
        return this.backingStore.get("identityName");
    }
    /**
     * Gets the identityPublisherHash property value. The Identity Publisher Hash.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getIdentityPublisherHash() {
        return this.backingStore.get("identityPublisherHash");
    }
    /**
     * Gets the identityResourceIdentifier property value. The Identity Resource Identifier.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getIdentityResourceIdentifier() {
        return this.backingStore.get("identityResourceIdentifier");
    }
    /**
     * Gets the identityVersion property value. The identity version.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getIdentityVersion() {
        return this.backingStore.get("identityVersion");
    }
    /**
     * Gets the minimumSupportedOperatingSystem property value. The minimum operating system required for a Windows mobile app.
     * @return a WindowsMinimumOperatingSystem
     */
    @jakarta.annotation.Nullable
    public WindowsMinimumOperatingSystem getMinimumSupportedOperatingSystem() {
        return this.backingStore.get("minimumSupportedOperatingSystem");
    }
    /**
     * Gets the phoneProductIdentifier property value. The Phone Product Identifier.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPhoneProductIdentifier() {
        return this.backingStore.get("phoneProductIdentifier");
    }
    /**
     * Gets the phonePublisherId property value. The Phone Publisher Id.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPhonePublisherId() {
        return this.backingStore.get("phonePublisherId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumSetValue("applicableArchitectures", this.getApplicableArchitectures());
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
     */
    public void setApplicableArchitectures(@jakarta.annotation.Nullable final EnumSet<WindowsArchitecture> value) {
        this.backingStore.set("applicableArchitectures", value);
    }
    /**
     * Sets the identityName property value. The Identity Name.
     * @param value Value to set for the identityName property.
     */
    public void setIdentityName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("identityName", value);
    }
    /**
     * Sets the identityPublisherHash property value. The Identity Publisher Hash.
     * @param value Value to set for the identityPublisherHash property.
     */
    public void setIdentityPublisherHash(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("identityPublisherHash", value);
    }
    /**
     * Sets the identityResourceIdentifier property value. The Identity Resource Identifier.
     * @param value Value to set for the identityResourceIdentifier property.
     */
    public void setIdentityResourceIdentifier(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("identityResourceIdentifier", value);
    }
    /**
     * Sets the identityVersion property value. The identity version.
     * @param value Value to set for the identityVersion property.
     */
    public void setIdentityVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("identityVersion", value);
    }
    /**
     * Sets the minimumSupportedOperatingSystem property value. The minimum operating system required for a Windows mobile app.
     * @param value Value to set for the minimumSupportedOperatingSystem property.
     */
    public void setMinimumSupportedOperatingSystem(@jakarta.annotation.Nullable final WindowsMinimumOperatingSystem value) {
        this.backingStore.set("minimumSupportedOperatingSystem", value);
    }
    /**
     * Sets the phoneProductIdentifier property value. The Phone Product Identifier.
     * @param value Value to set for the phoneProductIdentifier property.
     */
    public void setPhoneProductIdentifier(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("phoneProductIdentifier", value);
    }
    /**
     * Sets the phonePublisherId property value. The Phone Publisher Id.
     * @param value Value to set for the phonePublisherId property.
     */
    public void setPhonePublisherId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("phonePublisherId", value);
    }
}
