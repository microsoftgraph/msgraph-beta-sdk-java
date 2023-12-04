package com.microsoft.graph.models.security;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ThreatSubmissionRoot extends Entity implements Parsable {
    /**
     * Instantiates a new ThreatSubmissionRoot and sets the default values.
     */
    public ThreatSubmissionRoot() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ThreatSubmissionRoot
     */
    @jakarta.annotation.Nonnull
    public static ThreatSubmissionRoot createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ThreatSubmissionRoot();
    }
    /**
     * Gets the emailThreats property value. The emailThreats property
     * @return a java.util.List<EmailThreatSubmission>
     */
    @jakarta.annotation.Nullable
    public java.util.List<EmailThreatSubmission> getEmailThreats() {
        return this.backingStore.get("emailThreats");
    }
    /**
     * Gets the emailThreatSubmissionPolicies property value. The emailThreatSubmissionPolicies property
     * @return a java.util.List<EmailThreatSubmissionPolicy>
     */
    @jakarta.annotation.Nullable
    public java.util.List<EmailThreatSubmissionPolicy> getEmailThreatSubmissionPolicies() {
        return this.backingStore.get("emailThreatSubmissionPolicies");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("emailThreats", (n) -> { this.setEmailThreats(n.getCollectionOfObjectValues(EmailThreatSubmission::createFromDiscriminatorValue)); });
        deserializerMap.put("emailThreatSubmissionPolicies", (n) -> { this.setEmailThreatSubmissionPolicies(n.getCollectionOfObjectValues(EmailThreatSubmissionPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("fileThreats", (n) -> { this.setFileThreats(n.getCollectionOfObjectValues(FileThreatSubmission::createFromDiscriminatorValue)); });
        deserializerMap.put("urlThreats", (n) -> { this.setUrlThreats(n.getCollectionOfObjectValues(UrlThreatSubmission::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the fileThreats property value. The fileThreats property
     * @return a java.util.List<FileThreatSubmission>
     */
    @jakarta.annotation.Nullable
    public java.util.List<FileThreatSubmission> getFileThreats() {
        return this.backingStore.get("fileThreats");
    }
    /**
     * Gets the urlThreats property value. The urlThreats property
     * @return a java.util.List<UrlThreatSubmission>
     */
    @jakarta.annotation.Nullable
    public java.util.List<UrlThreatSubmission> getUrlThreats() {
        return this.backingStore.get("urlThreats");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("emailThreats", this.getEmailThreats());
        writer.writeCollectionOfObjectValues("emailThreatSubmissionPolicies", this.getEmailThreatSubmissionPolicies());
        writer.writeCollectionOfObjectValues("fileThreats", this.getFileThreats());
        writer.writeCollectionOfObjectValues("urlThreats", this.getUrlThreats());
    }
    /**
     * Sets the emailThreats property value. The emailThreats property
     * @param value Value to set for the emailThreats property.
     */
    public void setEmailThreats(@jakarta.annotation.Nullable final java.util.List<EmailThreatSubmission> value) {
        this.backingStore.set("emailThreats", value);
    }
    /**
     * Sets the emailThreatSubmissionPolicies property value. The emailThreatSubmissionPolicies property
     * @param value Value to set for the emailThreatSubmissionPolicies property.
     */
    public void setEmailThreatSubmissionPolicies(@jakarta.annotation.Nullable final java.util.List<EmailThreatSubmissionPolicy> value) {
        this.backingStore.set("emailThreatSubmissionPolicies", value);
    }
    /**
     * Sets the fileThreats property value. The fileThreats property
     * @param value Value to set for the fileThreats property.
     */
    public void setFileThreats(@jakarta.annotation.Nullable final java.util.List<FileThreatSubmission> value) {
        this.backingStore.set("fileThreats", value);
    }
    /**
     * Sets the urlThreats property value. The urlThreats property
     * @param value Value to set for the urlThreats property.
     */
    public void setUrlThreats(@jakarta.annotation.Nullable final java.util.List<UrlThreatSubmission> value) {
        this.backingStore.set("urlThreats", value);
    }
}
