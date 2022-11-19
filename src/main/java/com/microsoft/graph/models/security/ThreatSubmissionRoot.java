package com.microsoft.graph.models.security;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ThreatSubmissionRoot extends Entity implements Parsable {
    /** The emailThreats property */
    private java.util.List<EmailThreatSubmission> _emailThreats;
    /** The emailThreatSubmissionPolicies property */
    private java.util.List<EmailThreatSubmissionPolicy> _emailThreatSubmissionPolicies;
    /** The fileThreats property */
    private java.util.List<FileThreatSubmission> _fileThreats;
    /** The urlThreats property */
    private java.util.List<UrlThreatSubmission> _urlThreats;
    /**
     * Instantiates a new threatSubmissionRoot and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ThreatSubmissionRoot() {
        super();
        this.setOdataType("#microsoft.graph.security.threatSubmissionRoot");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a threatSubmissionRoot
     */
    @javax.annotation.Nonnull
    public static ThreatSubmissionRoot createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ThreatSubmissionRoot();
    }
    /**
     * Gets the emailThreats property value. The emailThreats property
     * @return a emailThreatSubmission
     */
    @javax.annotation.Nullable
    public java.util.List<EmailThreatSubmission> getEmailThreats() {
        return this._emailThreats;
    }
    /**
     * Gets the emailThreatSubmissionPolicies property value. The emailThreatSubmissionPolicies property
     * @return a emailThreatSubmissionPolicy
     */
    @javax.annotation.Nullable
    public java.util.List<EmailThreatSubmissionPolicy> getEmailThreatSubmissionPolicies() {
        return this._emailThreatSubmissionPolicies;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ThreatSubmissionRoot currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("emailThreats", (n) -> { currentObject.setEmailThreats(n.getCollectionOfObjectValues(EmailThreatSubmission::createFromDiscriminatorValue)); });
        deserializerMap.put("emailThreatSubmissionPolicies", (n) -> { currentObject.setEmailThreatSubmissionPolicies(n.getCollectionOfObjectValues(EmailThreatSubmissionPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("fileThreats", (n) -> { currentObject.setFileThreats(n.getCollectionOfObjectValues(FileThreatSubmission::createFromDiscriminatorValue)); });
        deserializerMap.put("urlThreats", (n) -> { currentObject.setUrlThreats(n.getCollectionOfObjectValues(UrlThreatSubmission::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the fileThreats property value. The fileThreats property
     * @return a fileThreatSubmission
     */
    @javax.annotation.Nullable
    public java.util.List<FileThreatSubmission> getFileThreats() {
        return this._fileThreats;
    }
    /**
     * Gets the urlThreats property value. The urlThreats property
     * @return a urlThreatSubmission
     */
    @javax.annotation.Nullable
    public java.util.List<UrlThreatSubmission> getUrlThreats() {
        return this._urlThreats;
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
        writer.writeCollectionOfObjectValues("emailThreats", this.getEmailThreats());
        writer.writeCollectionOfObjectValues("emailThreatSubmissionPolicies", this.getEmailThreatSubmissionPolicies());
        writer.writeCollectionOfObjectValues("fileThreats", this.getFileThreats());
        writer.writeCollectionOfObjectValues("urlThreats", this.getUrlThreats());
    }
    /**
     * Sets the emailThreats property value. The emailThreats property
     * @param value Value to set for the emailThreats property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEmailThreats(@javax.annotation.Nullable final java.util.List<EmailThreatSubmission> value) {
        this._emailThreats = value;
    }
    /**
     * Sets the emailThreatSubmissionPolicies property value. The emailThreatSubmissionPolicies property
     * @param value Value to set for the emailThreatSubmissionPolicies property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEmailThreatSubmissionPolicies(@javax.annotation.Nullable final java.util.List<EmailThreatSubmissionPolicy> value) {
        this._emailThreatSubmissionPolicies = value;
    }
    /**
     * Sets the fileThreats property value. The fileThreats property
     * @param value Value to set for the fileThreats property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFileThreats(@javax.annotation.Nullable final java.util.List<FileThreatSubmission> value) {
        this._fileThreats = value;
    }
    /**
     * Sets the urlThreats property value. The urlThreats property
     * @param value Value to set for the urlThreats property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUrlThreats(@javax.annotation.Nullable final java.util.List<UrlThreatSubmission> value) {
        this._urlThreats = value;
    }
}
