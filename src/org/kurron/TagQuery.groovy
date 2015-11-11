package org.kurron

/**
 * Created by vagrant on 11/11/15.
 */

def catalog = 'http://docker:docker@docker-registry-load-balancer-385982309.us-west-2.elb.amazonaws.com/v2/_catalog'
def images = new URL( catalog ).text
def bob = 1