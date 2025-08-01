package com.microsoft.graph.beta.models.networkaccess;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TlsInspectionPolicy extends Policy implements Parsable {
    /**
     * Instantiates a new {@link TlsInspectionPolicy} and sets the default values.
     */
    public TlsInspectionPolicy() {
        super();
        this.setOdataType("#microsoft.graph.networkaccess.tlsInspectionPolicy");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link TlsInspectionPolicy}
     */
    @jakarta.annotation.Nonnull
    public static TlsInspectionPolicy createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TlsInspectionPolicy();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("settings", (n) -> { this.setSettings(n.getObjectValue(TlsInspectionPolicySettings::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the lastModifiedDateTime property value. The timestamp of when the policy was last modified. Supports $filter (eq, ne, not, ge, le, in) and $orderby. Read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the settings property value. The settings property
     * @return a {@link TlsInspectionPolicySettings}
     */
    @jakarta.annotation.Nullable
    public TlsInspectionPolicySettings getSettings() {
        return this.backingStore.get("settings");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeObjectValue("settings", this.getSettings());
    }
    /**
     * Sets the lastModifiedDateTime property value. The timestamp of when the policy was last modified. Supports $filter (eq, ne, not, ge, le, in) and $orderby. Read-only.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the settings property value. The settings property
     * @param value Value to set for the settings property.
     */
    public void setSettings(@jakarta.annotation.Nullable final TlsInspectionPolicySettings value) {
        this.backingStore.set("settings", value);
    }
}
