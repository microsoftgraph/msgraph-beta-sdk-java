package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SubjectRightsRequestEnumeratedMailboxLocation extends SubjectRightsRequestMailboxLocation implements Parsable {
    /**
     * Collection of mailboxes that should be included in the search. Includes the UPN (user principal name) of each mailbox, for example, Monica.Thompson@contoso.com.
     */
    private java.util.List<String> upns;
    /**
     * Instantiates a new subjectRightsRequestEnumeratedMailboxLocation and sets the default values.
     */
    public SubjectRightsRequestEnumeratedMailboxLocation() {
        super();
        this.setOdataType("#microsoft.graph.subjectRightsRequestEnumeratedMailboxLocation");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a subjectRightsRequestEnumeratedMailboxLocation
     */
    @jakarta.annotation.Nonnull
    public static SubjectRightsRequestEnumeratedMailboxLocation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SubjectRightsRequestEnumeratedMailboxLocation();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("upns", (n) -> { this.setUpns(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the upns property value. Collection of mailboxes that should be included in the search. Includes the UPN (user principal name) of each mailbox, for example, Monica.Thompson@contoso.com.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getUpns() {
        return this.upns;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfPrimitiveValues("upns", this.getUpns());
    }
    /**
     * Sets the upns property value. Collection of mailboxes that should be included in the search. Includes the UPN (user principal name) of each mailbox, for example, Monica.Thompson@contoso.com.
     * @param value Value to set for the upns property.
     */
    public void setUpns(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.upns = value;
    }
}
