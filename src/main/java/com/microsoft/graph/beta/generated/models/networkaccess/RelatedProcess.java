package com.microsoft.graph.beta.models.networkaccess;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RelatedProcess extends RelatedResource implements Parsable {
    /**
     * Instantiates a new {@link RelatedProcess} and sets the default values.
     */
    public RelatedProcess() {
        super();
        this.setOdataType("#microsoft.graph.networkaccess.relatedProcess");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link RelatedProcess}
     */
    @jakarta.annotation.Nonnull
    public static RelatedProcess createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RelatedProcess();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("isSuspicious", (n) -> { this.setIsSuspicious(n.getBooleanValue()); });
        deserializerMap.put("processName", (n) -> { this.setProcessName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isSuspicious property value. The isSuspicious property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsSuspicious() {
        return this.backingStore.get("isSuspicious");
    }
    /**
     * Gets the processName property value. The processName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProcessName() {
        return this.backingStore.get("processName");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("isSuspicious", this.getIsSuspicious());
        writer.writeStringValue("processName", this.getProcessName());
    }
    /**
     * Sets the isSuspicious property value. The isSuspicious property
     * @param value Value to set for the isSuspicious property.
     */
    public void setIsSuspicious(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isSuspicious", value);
    }
    /**
     * Sets the processName property value. The processName property
     * @param value Value to set for the processName property.
     */
    public void setProcessName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("processName", value);
    }
}
