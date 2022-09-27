package com.microsoft.graph.external.connections.item.items.item.addactivities;

import com.microsoft.graph.models.externalconnectors.ExternalActivity;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to call the addActivities method. */
public class AddActivitiesPostRequestBody implements AdditionalDataHolder, Parsable {
    /** The activities property */
    private java.util.List<ExternalActivity> _activities;
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /**
     * Instantiates a new addActivitiesPostRequestBody and sets the default values.
     * @return a void
     */
    public AddActivitiesPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a addActivitiesPostRequestBody
     */
    @javax.annotation.Nonnull
    public static AddActivitiesPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AddActivitiesPostRequestBody();
    }
    /**
     * Gets the activities property value. The activities property
     * @return a externalActivity
     */
    @javax.annotation.Nullable
    public java.util.List<ExternalActivity> getActivities() {
        return this._activities;
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AddActivitiesPostRequestBody currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(1) {{
            this.put("activities", (n) -> { currentObject.setActivities(n.getCollectionOfObjectValues(ExternalActivity::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("activities", this.getActivities());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the activities property value. The activities property
     * @param value Value to set for the activities property.
     * @return a void
     */
    public void setActivities(@javax.annotation.Nullable final java.util.List<ExternalActivity> value) {
        this._activities = value;
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
}
