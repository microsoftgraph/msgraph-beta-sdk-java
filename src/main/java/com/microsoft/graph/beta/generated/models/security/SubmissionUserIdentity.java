package com.microsoft.graph.beta.models.security;

import com.microsoft.graph.beta.models.Identity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SubmissionUserIdentity extends Identity implements Parsable {
    /**
     * Instantiates a new {@link SubmissionUserIdentity} and sets the default values.
     */
    public SubmissionUserIdentity() {
        super();
        this.setOdataType("#microsoft.graph.security.submissionUserIdentity");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SubmissionUserIdentity}
     */
    @jakarta.annotation.Nonnull
    public static SubmissionUserIdentity createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SubmissionUserIdentity();
    }
    /**
     * Gets the email property value. The email of user who is making the submission when logged in (delegated token case).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEmail() {
        return this.backingStore.get("email");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("email", (n) -> { this.setEmail(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("email", this.getEmail());
    }
    /**
     * Sets the email property value. The email of user who is making the submission when logged in (delegated token case).
     * @param value Value to set for the email property.
     */
    public void setEmail(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("email", value);
    }
}
