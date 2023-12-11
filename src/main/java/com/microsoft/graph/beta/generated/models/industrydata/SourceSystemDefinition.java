package com.microsoft.graph.beta.models.industrydata;

import com.microsoft.graph.beta.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SourceSystemDefinition extends Entity implements Parsable {
    /**
     * Instantiates a new SourceSystemDefinition and sets the default values.
     */
    public SourceSystemDefinition() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SourceSystemDefinition
     */
    @jakarta.annotation.Nonnull
    public static SourceSystemDefinition createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SourceSystemDefinition();
    }
    /**
     * Gets the displayName property value. The name of the source system. Maximum supported length is 100 characters.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("userMatchingSettings", (n) -> { this.setUserMatchingSettings(n.getCollectionOfObjectValues(UserMatchingSetting::createFromDiscriminatorValue)); });
        deserializerMap.put("vendor", (n) -> { this.setVendor(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the userMatchingSettings property value. A collection of user matching settings by roleGroup.
     * @return a java.util.List<UserMatchingSetting>
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserMatchingSetting> getUserMatchingSettings() {
        return this.backingStore.get("userMatchingSettings");
    }
    /**
     * Gets the vendor property value. The name of the vendor who supplies the source system. Maximum supported length is 100 characters.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getVendor() {
        return this.backingStore.get("vendor");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfObjectValues("userMatchingSettings", this.getUserMatchingSettings());
        writer.writeStringValue("vendor", this.getVendor());
    }
    /**
     * Sets the displayName property value. The name of the source system. Maximum supported length is 100 characters.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the userMatchingSettings property value. A collection of user matching settings by roleGroup.
     * @param value Value to set for the userMatchingSettings property.
     */
    public void setUserMatchingSettings(@jakarta.annotation.Nullable final java.util.List<UserMatchingSetting> value) {
        this.backingStore.set("userMatchingSettings", value);
    }
    /**
     * Sets the vendor property value. The name of the vendor who supplies the source system. Maximum supported length is 100 characters.
     * @param value Value to set for the vendor property.
     */
    public void setVendor(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("vendor", value);
    }
}
