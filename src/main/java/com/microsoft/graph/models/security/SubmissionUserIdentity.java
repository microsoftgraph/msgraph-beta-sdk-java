package com.microsoft.graph.models.security;

import com.microsoft.graph.models.Identity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SubmissionUserIdentity extends Identity implements Parsable {
    /** The email of user who is making the submission when logged in (delegated token case). */
    private String _email;
    /**
     * Instantiates a new SubmissionUserIdentity and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public SubmissionUserIdentity() {
        super();
        this.setOdataType("#microsoft.graph.security.submissionUserIdentity");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SubmissionUserIdentity
     */
    @javax.annotation.Nonnull
    public static SubmissionUserIdentity createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SubmissionUserIdentity();
    }
    /**
     * Gets the email property value. The email of user who is making the submission when logged in (delegated token case).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEmail() {
        return this._email;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final SubmissionUserIdentity currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("email", (n) -> { currentObject.setEmail(n.getStringValue()); });
        return deserializerMap;
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
        writer.writeStringValue("email", this.getEmail());
    }
    /**
     * Sets the email property value. The email of user who is making the submission when logged in (delegated token case).
     * @param value Value to set for the email property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEmail(@javax.annotation.Nullable final String value) {
        this._email = value;
    }
}
