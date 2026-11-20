package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ResourcePolicyConfiguration extends Entity implements Parsable {
    /**
     * Instantiates a new {@link ResourcePolicyConfiguration} and sets the default values.
     */
    public ResourcePolicyConfiguration() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ResourcePolicyConfiguration}
     */
    @jakarta.annotation.Nonnull
    public static ResourcePolicyConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ResourcePolicyConfiguration();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("privilegedReadSetting", (n) -> { this.setPrivilegedReadSetting(n.getObjectValue(PrivilegedReadSetting::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the privilegedReadSetting property value. The privilegedReadSetting property
     * @return a {@link PrivilegedReadSetting}
     */
    @jakarta.annotation.Nullable
    public PrivilegedReadSetting getPrivilegedReadSetting() {
        return this.backingStore.get("privilegedReadSetting");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("privilegedReadSetting", this.getPrivilegedReadSetting());
    }
    /**
     * Sets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the privilegedReadSetting property value. The privilegedReadSetting property
     * @param value Value to set for the privilegedReadSetting property.
     */
    public void setPrivilegedReadSetting(@jakarta.annotation.Nullable final PrivilegedReadSetting value) {
        this.backingStore.set("privilegedReadSetting", value);
    }
}
