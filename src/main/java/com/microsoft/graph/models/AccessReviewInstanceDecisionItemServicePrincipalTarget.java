package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AccessReviewInstanceDecisionItemServicePrincipalTarget extends AccessReviewInstanceDecisionItemTarget implements Parsable {
    /** The appId for the service principal entity being reviewed. */
    private String _appId;
    /** The display name of the service principal whose access is being reviewed. */
    private String _servicePrincipalDisplayName;
    /** The servicePrincipalId property */
    private String _servicePrincipalId;
    /**
     * Instantiates a new AccessReviewInstanceDecisionItemServicePrincipalTarget and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AccessReviewInstanceDecisionItemServicePrincipalTarget() {
        super();
        this.setOdataType("#microsoft.graph.accessReviewInstanceDecisionItemServicePrincipalTarget");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AccessReviewInstanceDecisionItemServicePrincipalTarget
     */
    @javax.annotation.Nonnull
    public static AccessReviewInstanceDecisionItemServicePrincipalTarget createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessReviewInstanceDecisionItemServicePrincipalTarget();
    }
    /**
     * Gets the appId property value. The appId for the service principal entity being reviewed.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAppId() {
        return this._appId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AccessReviewInstanceDecisionItemServicePrincipalTarget currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("appId", (n) -> { currentObject.setAppId(n.getStringValue()); });
            this.put("servicePrincipalDisplayName", (n) -> { currentObject.setServicePrincipalDisplayName(n.getStringValue()); });
            this.put("servicePrincipalId", (n) -> { currentObject.setServicePrincipalId(n.getStringValue()); });
        }};
    }
    /**
     * Gets the servicePrincipalDisplayName property value. The display name of the service principal whose access is being reviewed.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getServicePrincipalDisplayName() {
        return this._servicePrincipalDisplayName;
    }
    /**
     * Gets the servicePrincipalId property value. The servicePrincipalId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getServicePrincipalId() {
        return this._servicePrincipalId;
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
        writer.writeStringValue("appId", this.getAppId());
        writer.writeStringValue("servicePrincipalDisplayName", this.getServicePrincipalDisplayName());
        writer.writeStringValue("servicePrincipalId", this.getServicePrincipalId());
    }
    /**
     * Sets the appId property value. The appId for the service principal entity being reviewed.
     * @param value Value to set for the appId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppId(@javax.annotation.Nullable final String value) {
        this._appId = value;
    }
    /**
     * Sets the servicePrincipalDisplayName property value. The display name of the service principal whose access is being reviewed.
     * @param value Value to set for the servicePrincipalDisplayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setServicePrincipalDisplayName(@javax.annotation.Nullable final String value) {
        this._servicePrincipalDisplayName = value;
    }
    /**
     * Sets the servicePrincipalId property value. The servicePrincipalId property
     * @param value Value to set for the servicePrincipalId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setServicePrincipalId(@javax.annotation.Nullable final String value) {
        this._servicePrincipalId = value;
    }
}
