package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class VirtualEventPresenter extends Entity implements Parsable {
    /**
     * Email address of the presenter.
     */
    private String email;
    /**
     * Identity information of the presenter.
     */
    private CommunicationsUserIdentity identity;
    /**
     * Other detail information of the presenter.
     */
    private VirtualEventPresenterDetails presenterDetails;
    /**
     * Instantiates a new virtualEventPresenter and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public VirtualEventPresenter() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a virtualEventPresenter
     */
    @javax.annotation.Nonnull
    public static VirtualEventPresenter createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VirtualEventPresenter();
    }
    /**
     * Gets the email property value. Email address of the presenter.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEmail() {
        return this.email;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("email", (n) -> { this.setEmail(n.getStringValue()); });
        deserializerMap.put("identity", (n) -> { this.setIdentity(n.getObjectValue(CommunicationsUserIdentity::createFromDiscriminatorValue)); });
        deserializerMap.put("presenterDetails", (n) -> { this.setPresenterDetails(n.getObjectValue(VirtualEventPresenterDetails::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the identity property value. Identity information of the presenter.
     * @return a communicationsUserIdentity
     */
    @javax.annotation.Nullable
    public CommunicationsUserIdentity getIdentity() {
        return this.identity;
    }
    /**
     * Gets the presenterDetails property value. Other detail information of the presenter.
     * @return a virtualEventPresenterDetails
     */
    @javax.annotation.Nullable
    public VirtualEventPresenterDetails getPresenterDetails() {
        return this.presenterDetails;
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
        writer.writeObjectValue("identity", this.getIdentity());
        writer.writeObjectValue("presenterDetails", this.getPresenterDetails());
    }
    /**
     * Sets the email property value. Email address of the presenter.
     * @param value Value to set for the email property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEmail(@javax.annotation.Nullable final String value) {
        this.email = value;
    }
    /**
     * Sets the identity property value. Identity information of the presenter.
     * @param value Value to set for the identity property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIdentity(@javax.annotation.Nullable final CommunicationsUserIdentity value) {
        this.identity = value;
    }
    /**
     * Sets the presenterDetails property value. Other detail information of the presenter.
     * @param value Value to set for the presenterDetails property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPresenterDetails(@javax.annotation.Nullable final VirtualEventPresenterDetails value) {
        this.presenterDetails = value;
    }
}
