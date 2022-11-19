package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SubjectRightsRequestEnumeratedMailboxLocation extends SubjectRightsRequestMailboxLocation implements Parsable {
    /** Collection of mailboxes that should be included in the search. Includes the UPN (user principal name) of each mailbox, for example, Monica.Thompson@contoso.com. */
    private java.util.List<String> _upns;
    /**
     * Instantiates a new SubjectRightsRequestEnumeratedMailboxLocation and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public SubjectRightsRequestEnumeratedMailboxLocation() {
        super();
        this.setOdataType("#microsoft.graph.subjectRightsRequestEnumeratedMailboxLocation");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SubjectRightsRequestEnumeratedMailboxLocation
     */
    @javax.annotation.Nonnull
    public static SubjectRightsRequestEnumeratedMailboxLocation createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SubjectRightsRequestEnumeratedMailboxLocation();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final SubjectRightsRequestEnumeratedMailboxLocation currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("upns", (n) -> { currentObject.setUpns(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap
    }
    /**
     * Gets the upns property value. Collection of mailboxes that should be included in the search. Includes the UPN (user principal name) of each mailbox, for example, Monica.Thompson@contoso.com.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getUpns() {
        return this._upns;
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
        writer.writeCollectionOfPrimitiveValues("upns", this.getUpns());
    }
    /**
     * Sets the upns property value. Collection of mailboxes that should be included in the search. Includes the UPN (user principal name) of each mailbox, for example, Monica.Thompson@contoso.com.
     * @param value Value to set for the upns property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUpns(@javax.annotation.Nullable final java.util.List<String> value) {
        this._upns = value;
    }
}
