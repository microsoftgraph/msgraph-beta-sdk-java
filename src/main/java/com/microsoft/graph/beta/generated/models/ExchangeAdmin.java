package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ExchangeAdmin extends Entity implements Parsable {
    /**
     * Instantiates a new {@link ExchangeAdmin} and sets the default values.
     */
    public ExchangeAdmin() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ExchangeAdmin}
     */
    @jakarta.annotation.Nonnull
    public static ExchangeAdmin createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ExchangeAdmin();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("mailboxes", (n) -> { this.setMailboxes(n.getCollectionOfObjectValues(Mailbox::createFromDiscriminatorValue)); });
        deserializerMap.put("messageTraces", (n) -> { this.setMessageTraces(n.getCollectionOfObjectValues(MessageTrace::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the mailboxes property value. Represents a user's mailboxes.
     * @return a {@link java.util.List<Mailbox>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Mailbox> getMailboxes() {
        return this.backingStore.get("mailboxes");
    }
    /**
     * Gets the messageTraces property value. The messageTraces property
     * @return a {@link java.util.List<MessageTrace>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<MessageTrace> getMessageTraces() {
        return this.backingStore.get("messageTraces");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("mailboxes", this.getMailboxes());
        writer.writeCollectionOfObjectValues("messageTraces", this.getMessageTraces());
    }
    /**
     * Sets the mailboxes property value. Represents a user's mailboxes.
     * @param value Value to set for the mailboxes property.
     */
    public void setMailboxes(@jakarta.annotation.Nullable final java.util.List<Mailbox> value) {
        this.backingStore.set("mailboxes", value);
    }
    /**
     * Sets the messageTraces property value. The messageTraces property
     * @param value Value to set for the messageTraces property.
     */
    public void setMessageTraces(@jakarta.annotation.Nullable final java.util.List<MessageTrace> value) {
        this.backingStore.set("messageTraces", value);
    }
}
