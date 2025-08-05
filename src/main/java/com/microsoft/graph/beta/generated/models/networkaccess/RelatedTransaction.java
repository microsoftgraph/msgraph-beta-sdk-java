package com.microsoft.graph.beta.models.networkaccess;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RelatedTransaction extends RelatedResource implements Parsable {
    /**
     * Instantiates a new {@link RelatedTransaction} and sets the default values.
     */
    public RelatedTransaction() {
        super();
        this.setOdataType("#microsoft.graph.networkaccess.relatedTransaction");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link RelatedTransaction}
     */
    @jakarta.annotation.Nonnull
    public static RelatedTransaction createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RelatedTransaction();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("transactionId", (n) -> { this.setTransactionId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the transactionId property value. Unique identifier of the transaction. Required.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTransactionId() {
        return this.backingStore.get("transactionId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("transactionId", this.getTransactionId());
    }
    /**
     * Sets the transactionId property value. Unique identifier of the transaction. Required.
     * @param value Value to set for the transactionId property.
     */
    public void setTransactionId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("transactionId", value);
    }
}
